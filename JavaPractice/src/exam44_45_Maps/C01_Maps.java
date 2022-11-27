package exam44_45_Maps;

import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {
        Map<Integer,String> studentMap1= MapStore.createMap();
        System.out.println(studentMap1);
        System.out.println(studentMap1.get(101));

        // we will write name and surname of student who have 105 number
        int studentKey=105;
        String nameAndSurname = MapStore.writeNameAndSurname(studentMap1,studentKey);
        System.out.println(nameAndSurname);
    }
}
