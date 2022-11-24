package exam41_iterator;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {
        // java collections icerisinde bazı classlar index desteklemez
        //bu durumda index kullanmadan coll icindeki tüm elementlere ulasabilmek
        //ve onları update edebilmek icin farklı ihtiyaclarımız olur
        // List<> index yapısını destekler bugun ancak indexsiz List elementlerine ulasmaya calısacagız

        List<Integer> number =  new ArrayList<>();
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);

        for (Integer each: number) {
            System.out.print(each + " ");
        }
        // elemanlrı bir artıralım
        for (Integer each: number) {
            each ++;      // loop icinde değişken loop dısına etki etmez..
            System.out.print (each + " ");
        }
        System.out.println("***********************");
        System.out.println(number);
        /* index kullanmadan LİST i kalıcı değiştirmek icin iterator ınterface kullanmamız gerekir
         * sıra gözeterek gider ve her seferinde bunu belirtmek lazım..
         *
         * */



    }
}