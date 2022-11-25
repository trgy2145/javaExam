package exam42_collection;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C06_SetQuestion {
    public static void main(String[] args) {
        // creat hashset and treeset
        // firstly produce random 10000 number then this numbers add both of them
        // finally compare time of the process

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Random rnd = new Random();
        int number ;
        LocalTime hS1 = LocalTime.now();
        for (int i = 0; i < 10000; i++) {
            number = rnd.nextInt(100000);
            hashSet.add(number);


        }
        LocalTime hS2 = LocalTime.now();

        LocalTime tS1 = LocalTime.now();
        for (int i = 0; i < 10000; i++) {
            number = rnd.nextInt(100000);
            treeSet.add(number);

        }
        LocalTime tS2 = LocalTime.now();

        System.out.println("hashSet time :" + (hS2.getNano()-hS1.getNano()));
        System.out.println("tree Set start :" + tS1.getSecond() + " tree set finish :" + tS2.getSecond());
    }
}
