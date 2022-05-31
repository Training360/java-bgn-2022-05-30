package arrays;

import java.util.Arrays;

public class ArraysMain {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5};
        System.out.println(numbers[0]);

        numbers[1] = 7;
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

//        System.out.println(numbers[8]); - exception
        System.out.println(numbers.length);

        String[] names = new String[10];
        System.out.println(names[5]);
        names[3] = "John Doe";
        System.out.println(Arrays.toString(names));

        double[] percentages = new double[4];
        System.out.println(percentages[3]);
        System.out.println(Arrays.toString(percentages));

        for (double percentage: percentages) {
            System.out.println(percentage);
        }

        int[] matrix = {7, 9, 4, 2, 7, 8};
        for (int value: matrix) {
            System.out.println(value);
        }

        int[] submatrix = new int[4];
        System.arraycopy(matrix, 1, submatrix, 0, submatrix.length);
        System.out.println(Arrays.toString(submatrix));
    }
}
