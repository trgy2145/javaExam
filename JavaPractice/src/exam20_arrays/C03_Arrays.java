package exam20_arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        // input int [][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}}
        //output [10,3,12,10,9]
        int [][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        int[] newArr = new int[arr.length];
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];

            }
            newArr[i] = sum;
            sum = 0;

        }
        System.out.println(Arrays.toString(newArr));

    }
}
