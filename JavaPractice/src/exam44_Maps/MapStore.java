package exam44_Maps;

import java.util.HashMap;
import java.util.Map;

public class MapStore {
    // create a Map method
    public  static Map<Integer,String> createMap(){
        Map<Integer,String> studentMap = new HashMap<>();
        studentMap.put(101,"Ali-Can-10-H-MF");
        studentMap.put(102,"Veli-Cem-11-M-Soz");
        studentMap.put(103,"Ali-Cem-11-H-TM");
        studentMap.put(104,"Ayse-Can-10-H-MF");
        studentMap.put(105,"Ayse-Cem-11-M-TM");
        studentMap.put(106,"Fatma-Han-10-K-Soz");
        return studentMap;
    }

    public static String writeNameAndSurname(Map<Integer, String> studentMap1, int studentKey) {
        String [] valueArr = studentMap1.get(studentKey).split("-");
        return valueArr[0]+" " + valueArr[1];
    }
}
