package exam42_collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C05_LinkedListSet {
    public static void main(String[] args) {
        int [] arr ={1,2,3,6,7,5,4,8,7,5,4,0,8,9,6,3,0,1};
        Set<Integer> tempSet = new HashSet<>();
        for (Integer each:arr
             ) {
            tempSet.add(each);

        }
        int [] tempArr = new int[tempSet.size()];
        int i = 0;
        for (Integer each : tempSet
             ) {
            tempArr[i] = each;
            i++;
        }
        // gecici array i kendi arrayimize atalım
        arr = tempArr;
        System.out.println(Arrays.toString(arr));
    }
}
