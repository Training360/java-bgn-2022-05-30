package reflectiondemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DevicesFile {

    private Path path;

    public DevicesFile(Path path) {
        this.path = path;
    }

    public List<Device> getDevices() {
        List<Device> result = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(path);
            Device device = null;
            for (String line: lines) {
                String[] parts = line.split(":");
                String key = parts[0].trim();
                String value = parts[1].trim();

                if (key.equals("class")) {
                    String className = DevicesFile.class.getPackageName() + "." + value;
                    Class clazz = Class.forName(className);
                    Constructor constructor = clazz.getConstructor();
                    device = (Device) constructor.newInstance();
                    result.add(device);
                }
                else {
                    String methodName = "set" + key.substring(0, 1).toUpperCase()
                            + key.substring(1);

                    Method method = Arrays.stream(device.getClass().getMethods())
                            .filter(m -> m.getName().equals(methodName))
                            .findAny().get();

                    if (method.getParameterTypes()[0] == int.class) {
                        Integer i = Integer.parseInt(value);
                        method.invoke(device, i);
                    }
                    else {
                        method.invoke(device, value);
                    }
                }
            }
        }
        catch (Exception e) {
            throw new IllegalStateException("Can not read file", e);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new DevicesFile(Path.of("devices.txt")).getDevices());
    }
}
