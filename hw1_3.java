package Exception;

import java.util.Arrays;

public class hw1_3 {
    public static void main(String[] args) {
        int[] arr1 = {7,7,7};
        int[]arr2 = {4,5,6};
        int[] result = subArraysWithExceptionHandling (arr1, arr2);
        System.out.println(Arrays.toString(result));

    }

    public static int[] subArraysWithExceptionHandling(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length){
            throw new IllegalArgumentException("Массивы иеют разную длину");
        }

        int[] result = new int[arr1.length];
        for (int k = 0; k < result.length; k++) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    result[k] = arr1[i]-arr2[j];
                }
            }
        if (result[k] < 0){
            throw new RuntimeException("Oтрицательный результат разности");
        }
        }
        return result;
    }
}
