package exam46_entrySet;

import exam44_45_Maps.MapStore;

import java.util.Map;
import java.util.Set;

public class C01_EntrySet {
    public static void main(String[] args) {
        //all the departments,classes, names ,surnames,numbers on the studentMap will be written
        Map<Integer,String> studentMap = MapStore.createMap();
        System.out.println(studentMap);
        /*
        {
        101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10-K-Soz
        }

         */
       Set<Map.Entry<Integer,String>> studentEntrySet =studentMap.entrySet();
       System.out.println(studentEntrySet);
        /*
        [
        101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10-K-Soz
        }
         ]

        */

        // entrySet was printed
        int number = 1;
        for (Map.Entry<Integer, String> eachEntry: studentEntrySet
        ){
            System.out.println(number + "-   " + eachEntry);
            number++;
        }
        // in this block will be printed just keys
        for (Map.Entry<Integer,String> eachEntry: studentEntrySet
             ) {
            System.out.println(eachEntry.getKey());
        }
        // by using entrySet will increase the class count of all student
        // if there is 12th class ,we will remove it from the map
        String entryValues;
        String[] entryValuesArr;
        for (Map.Entry<Integer,String> eachEntry: studentEntrySet
             ) {
           entryValues = eachEntry.getValue();
           entryValuesArr = entryValues.split("-");
            if (entryValuesArr[2].equals("12")) {
                eachEntry.setValue("she(he) graduated");
            }else {
                int classNumber = Integer.parseInt(entryValuesArr[2]);
                classNumber++;
                entryValuesArr[2] = classNumber+""; // [Ali-Can-11-H-MF] int ile string toplanınca direk string olur
                eachEntry.setValue(entryValuesArr[0]+"-"+  // ==> Ali
                                   entryValuesArr[1]+"-"+  // ==> Can
                                   entryValuesArr[2]+"-"+  // ==> 11
                                   entryValuesArr[3]+"-"+  // ==> H
                                   entryValuesArr[4]       // ==> MF
                                   );
            }
        }
        System.out.println(studentMap);

    }
}
