package Exception;

import java.util.Arrays;

public class hw1_2 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[]arr2 = {4,-5,6};
        int[] result = sumArrays(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
    public static int[] sumArrays(int[] arr1, int[] arr2) throws IllegalArgumentException{
        if (arr1.length != arr2.length){
            throw new IllegalArgumentException("Массивы иеют разную длину");
        }

        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[1]+arr2[i];
        }
        for (int j = 0; j < result.length; j++) {
            if (result[j] < 0){
                throw new RuntimeException("Элемент отрицательный");
            }
        }
        return result;
    }
}
