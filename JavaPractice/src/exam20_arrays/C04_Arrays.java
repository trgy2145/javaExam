package exam20_arrays;

public class C04_Arrays {
    public static void main(String[] args) {
        // input int [][] arr1 = {{1,2,4},{3,4,5}}
        // output 480
        int [][] arr1 = {{1,2,4},{3,4,5}};
        System.out.println(count(arr1));

    }
    public static int count(int [][] arr){
        int num = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                num *=arr[i][j];

            }

        }
        return num;
    }
}
