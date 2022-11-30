package exam47_mapsMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C01_MapsMethods {
    public static void main(String[] args) {
        Map<String,Integer> mp1 = new HashMap<>();
        mp1.put("A",5);
        mp1.put("B",6);
        mp1.put("C",7);
        System.out.println(mp1.putIfAbsent("D", 9)); // bu değer önceden yoksa ekler null döner,
        // ancak var olan bir key kullanılırsa varolan key değerini döner eklemez
        System.out.println(mp1);

        String sentence = "Java ile hayat güzel mi?";
        String[] sentArr = sentence.split("");
        Map<String,Integer> newMap= new TreeMap<>();
        for (int i = 0; i < sentArr.length; i++) {


            newMap.computeIfPresent(sentArr[i],(k,v)->v+1);
            newMap.putIfAbsent(sentArr[i],1);

        }
        System.out.println(newMap);
    }
}
