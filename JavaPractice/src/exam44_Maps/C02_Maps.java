package exam44_Maps;

import java.util.Map;
import java.util.Scanner;

public class C02_Maps {
    public static void main(String[] args) {
        // change the department of the student
        Map<Integer,String> studentMap = MapStore.createMap();
        //yapılan her değişiklik burada ki ögrenciMap i etkiler depo ile hiç bir baglantısı yok..
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter number");
        int number  = scan.nextInt();
        String newDepartment = "K";
       studentMap = MapStore.changeDepartment(studentMap, number,newDepartment); // bu değişim runtime da oluyor unutma..
        System.out.println(studentMap);
    }
}
