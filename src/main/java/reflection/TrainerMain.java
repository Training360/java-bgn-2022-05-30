package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TrainerMain {

    public static void main(String[] args) {
        Class<Trainer> clazz = Trainer.class;
        Method[] methods = clazz.getMethods();
        for (Method method: methods) {
            System.out.println(method.getName());
        }

    }
}
