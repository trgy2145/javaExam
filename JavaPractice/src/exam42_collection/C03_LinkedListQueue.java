package exam42_collection;

import java.util.LinkedList;
import java.util.Queue;

public class C03_LinkedListQueue {
    public static void main(String[] args) {
        Queue<String> q1= new LinkedList<>();
        q1.add("A");
        q1.add("T");
        q1.offer("S") ; //kapasite sınırlaması yapmadıgınız surece add() ile aynı işi yapar
        q1.remove();// Queue de elemen sona eklenir birsey yazmazsak bastan siler..
        q1.poll(); // bastan elemanı siler yani remove ile aynı işi yapar bize o elemanı döndürür
        // aradaki fark bos elemanda calıstırırsak remove hata verir poll ise null verir
        q1.peek();//silmeden bastaki elementi getirir , bossa null döndürür
        q1.element();// bastaki elemanı getirir ama bos ise hata fırlatır..
        q1.clear();//siler
    }
}
