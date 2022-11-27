package exam44_45_Maps;

import java.util.Map;
import java.util.TreeMap;

public class C04_Maps {
    public static void main(String[] args) {
        // write a sentence and find out which how many times were used each letter of it
        String str = "Dunyaya geldik bir kere";
        String[] letterArray = str.split("");
       //  System.out.println(Arrays.toString(letterArray));
        Map<String,Integer> numberOfLetter = new TreeMap<>();
        int sayac = 1;
        //for every letter
        for (int i = 0; i <letterArray.length; i++) {
            // if there is any letter in this map
            if (numberOfLetter.containsKey(letterArray[i])) {
                continue;
            }else{
                for (int j = i+1; j < letterArray.length; j++) {
                    if(letterArray[j].equals(letterArray[i])){
                        sayac++;
                    }
                }
                numberOfLetter.put(letterArray[i],sayac);
                sayac=1;
            }

        }
        System.out.println(numberOfLetter);
    }
}
