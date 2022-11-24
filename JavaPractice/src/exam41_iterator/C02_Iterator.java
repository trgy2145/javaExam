package exam41_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(); // LİST İNTERFACE ANCAK onun childlerindan örn ArrayListten atama yapabiliriz.
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        Iterator it1= number.iterator(); // üc metodu var

        System.out.println(it1.hasNext()); // bakar eleman varmı true or flase
        System.out.println(it1.next());// iterator bir kadırır dönüşte atladıgı elementi getirir
        // biz burdan sonra bir döngü ile yazdırmaya calısırsak en son nerde kaldıysa iterator ordan devam eder.
         while (it1.hasNext()){
             System.out.print(it1.next()+ " ");
         }
         //iterator en son nerdeyse orda kalır bastan yazdırmak istersek yeni bir iterator olustırmak lazım

         Iterator it2 = number.iterator();
         while (it2.hasNext()){
             System.out.println(it2.next());
         }



    }

}
