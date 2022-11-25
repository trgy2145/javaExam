package exam20_arrays;


import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        // aynı indexe sahip elementleri toplayıp yeni arraya atayalım
        int [][] arr = {{3,4,5},{2,3,6,7}}; // input
        // output [5,7,11]


       //  System.out.println(Arrays.toString(arr[1]));
      /*  if(arr[0].length > arr[1].length){
            len = arr[1].length;
        }
        else{
            len = arr[0].length;
        }*/
        int len =arr[0].length > arr[1].length ? arr[1].length : arr[0].length;
        int[] newArray = new int[len];


      for (int i = 0; i < len; i++) {
                newArray[i] = arr[0][i]+arr[1][i];

         }
        System.out.println(Arrays.toString(newArray));

    }
}
