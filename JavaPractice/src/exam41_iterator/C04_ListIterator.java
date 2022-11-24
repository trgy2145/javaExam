package exam41_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_ListIterator {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        //  iterator kullanarak listenin elementlerini sondan basa dogru yazalım
        ListIterator lit = number.listIterator();
        // önce iterator sona götürelim
        while (lit.hasNext()){
            lit.hasNext(); // artık sondayız
        }
        // sondan basa dogru elemanları yazdıralım
        while (lit.hasPrevious()){

            System.out.print(lit.hasPrevious()+" ");

        }
        //iterator kullanrak listenin tüm elemnlarını 5 artırın
        //not en son nerde kaldıgınızı bilmeniz gerekir bunun icin
        System.out.println(lit.nextIndex());
        // kaldıgınız yerin solundaki indeksi verir
        while (lit.hasNext()){
            lit.set((Integer)lit.next()+5); //set ,update demektir

        }
        System.out.println(number);
        // 40 tan kücük sayıları silin  , önemli olan iterator nerde en sonda kalmıstık

        while (lit.hasPrevious()){
            if ((Integer)lit.previous()<40) {
                lit.remove();

            }
        }
        System.out.println(number);
    }
}
