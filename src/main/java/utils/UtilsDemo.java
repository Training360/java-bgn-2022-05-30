package utils;

import java.util.Random;

public class UtilsDemo {

    public static void main(String[] args) {
        System.out.println(Math.PI);

        long i = Math.round(3.56);
        System.out.println(i);

        Random random = new Random(123);
        System.out.println(random.nextInt());
        System.out.println(random.nextDouble());
        System.out.println(random.nextInt(10));

        System.out.println(Integer.MAX_VALUE);

        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(Integer.MIN_VALUE);

        int j = Integer.MAX_VALUE;
//        int k = Math.addExact(j, 1);

        System.out.println(random.nextInt(1, 7));
        System.out.println(random.nextInt(6) + 1);






    }
}
