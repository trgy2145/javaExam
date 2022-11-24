package exam41_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);

        // iterator kullanrak 15 ile 25 arasındaki sayıları siliniz

        // not next()bir obje döndürür eger primitive bir seyle karsılastıracaksan castıng yap

        Iterator it1 = number.iterator();
        Integer element;
        while (it1.hasNext()){

          /*  if(it1.next()>15 && it1.next()<25){  // not next()bir obje döndürür eger primitive bir seyle karsılastıracaksan castıng yap

            }*/
            element = (Integer) it1.next(); // cast ettik

            if (element >15 && element<25) {
                it1.remove();
            }
        }
        System.out.println(number); // [30,40,50]

        //  eleman silmek
        Iterator it2 = number.iterator();
         //  it2.remove();
        // calısmaz cünkü it2 suan en basta silebilmek icin önce bir atlatmalı sonra silmeli bu hep böylle olmalı
        it2.next();
        it2.remove();
        while (it2.hasNext()){
            it2.next();
            it2.remove();
        }
        System.out.println(number);

    }
}
