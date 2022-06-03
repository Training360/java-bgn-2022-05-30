package enums;

import java.util.Arrays;

public class ColorsMain {

    public static void main(String[] args) {
        Color myColor = Color.BLACK;

        System.out.println(Arrays.toString(Color.values()));
        System.out.println(Color.RED.ordinal());
        System.out.println(Color.GREEN.name());
        System.out.println(Color.GREEN.toString());

        Color favourite = Color.valueOf("RED");

        System.out.printf("%sez piros%s\n", Color.RED, Color.RESET);
        System.out.printf("%sez zöld%s\n", Color.GREEN, Color.RESET);
    }
}
