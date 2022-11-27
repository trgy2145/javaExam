package exam44_45_Maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C05_Maps {
    public static void main(String[] args) {
        //we are going to write that names and surnames and classes of their to having H department
        Map<Integer,String> studentMap = MapStore.createMap();
       Set<Integer> keys = studentMap.keySet(); // keySet() return  a Set

       Collection<String>  values = studentMap.values(); //keySet return a Collection
        String letter = "H";
        MapStore.takeNameAndSurnameAndClass(studentMap,letter);
    }
}
