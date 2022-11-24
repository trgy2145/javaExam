package exam20_arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        // input int [][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}}
        // output last element ==> 4 + 2 + 5 + 10 + 7 = 28
        int [][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        System.out.println(sum(arr));
    }
    public static int sum(int[][] arr){
        int num = 0;
        for (int i = 0; i < arr.length; i++) {

                num +=arr[i][(arr[i].length)-1];



        }
        return num ;
    }
}
