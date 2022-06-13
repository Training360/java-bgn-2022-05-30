package reflectiondemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DevicesFile {

    private Path path;

    private List<Device> result = new ArrayList<>();

    private Device device = null;

    private String key;

    private String value;

    public DevicesFile(Path path) {
        this.path = path;
    }

    public List<Device> getDevices() {
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line: lines) {
                parseLine(line);
                processLine();
            }
        }
        catch (Exception e) {
            throw new IllegalStateException("Can not read file", e);
        }
        return result;
    }

    private void processLine() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        if (key.equals("class")) {
            createDevice();
        }
        else {
            setAttribute();
        }
    }

    private void parseLine(String line) {
        String[] parts = line.split(":");
        key = parts[0].trim();
        value = parts[1].trim();
    }

    private void createDevice() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        String className = DevicesFile.class.getPackageName() + "." + value;
        Class<? extends Device> clazz = Class.forName(className).asSubclass(Device.class);
        Constructor<? extends Device> constructor = clazz.getConstructor();
        device = constructor.newInstance();
        result.add(device);
    }

    private void setAttribute() throws IllegalAccessException, InvocationTargetException {
        String methodName = createMethodName();
        Method method = findMethodByName(methodName);
        Class<?> parameterType = method.getParameterTypes()[0];
        Object convertedValue = convertValue(parameterType);
        method.invoke(device, convertedValue);
    }

    private String createMethodName() {
        return "set" + key.substring(0, 1).toUpperCase()
                + key.substring(1);
    }

    private Method findMethodByName(String methodName) {
        return  Arrays.stream(device.getClass().getMethods())
                .filter(m -> m.getName().equals(methodName))
                .findAny().orElseThrow();
    }

    private Object convertValue(Class<?> parameterType) {
        if (parameterType == int.class) {
            return Integer.parseInt(value);
        }
        else {
            return value;
        }
    }

    public static void main(String[] args) {
        System.out.println(new DevicesFile(Path.of("devices.txt")).getDevices());
    }
}
