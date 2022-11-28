package exam44_45_Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapStore {
    // create a Map method
    public  static Map<Integer,String> createMap(){
        Map<Integer,String> studentMap = new HashMap<>();
        studentMap.put(101,"Ali-Can-12-H-MF");
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

    public static Map<Integer, String> changeDepartment(Map<Integer, String> studentMap, int number,String department) {
        //istenen key varsa update edip geri döndür yoksa gelen map i döndür..
        if(studentMap.containsKey(number)){
            String valueOfKey = studentMap.get(number);
            String[] valueOfKeyArr = valueOfKey.split("-");
            valueOfKeyArr[3] = department;
            String newValueOfKeyArr ="";
            for (int i = 0; i < valueOfKeyArr.length; i++) {
                if (i == (valueOfKeyArr.length-1)) {
                    newValueOfKeyArr += valueOfKeyArr[i];

                }else
                    newValueOfKeyArr += valueOfKeyArr[i]+"-";


            }
            studentMap.put(number,newValueOfKeyArr);


        }
        return studentMap;
    }

    public static void takeNameAndSurnameAndClass(Map<Integer, String> studentMap, String letter) {
        Collection<String> valuesCollection =  studentMap.values();
        for (String each: valuesCollection) {
            String [] valuesArr = each.split("-");
            if (valuesArr[3].equals(letter)) {
                System.out.println(valuesArr[0] + " " + valuesArr[1]+" "+valuesArr[2]);
            }
        }
    }
}
