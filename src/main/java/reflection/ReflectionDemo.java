package reflection;

import java.util.Arrays;

public class ReflectionDemo {

    public void yyy() {

    }

    public void xxx() {

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ReflectionDemo.class.getMethods()));
    }
}
