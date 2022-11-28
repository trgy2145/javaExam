package exam46_entrySet;

import exam44_45_Maps.MapStore;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public static void main(String[] args) {
        //all the departments,classes, names ,surnames,numbers on the studentMap will be written
        Map<Integer,String> studentMap = MapStore.createMap();

        // format will be Soz, 11, Adem Demir, 109
        // we will create a treeSet method in this format then it will return us this Set
        Set<String> studentSet = MapStore.orderedTreeSetList(studentMap);
        System.out.println(studentSet);
    }
}
