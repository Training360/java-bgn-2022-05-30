package arrays;

import java.util.Arrays;

public class ArrayOfArraysDemo {

    public static void main(String[] args) {
        int[][] matrix = new int[4][];

        matrix[0] = new int[2];
        matrix[1] = new int[3];
        matrix[2] = new int[2];
        matrix[3] = new int[3];

        System.out.println(matrix[1][1]);
        System.out.println(matrix);
        System.out.println(Arrays.toString(matrix));
        System.out.println(Arrays.deepToString(matrix));

        int[] numbers = {6, 8, 2, 5, 1};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
