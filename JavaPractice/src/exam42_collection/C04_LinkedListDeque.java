package exam42_collection;

import java.util.Deque;
import java.util.LinkedList;

public class C04_LinkedListDeque {
    public static void main(String[] args) {
        Deque<String> dq1 = new LinkedList<>();
        /* dq1.add("C");
        dq1.add("D")
        dq1.push("A"); // basa ekler , sınırlandırma varsa ve yer yoksa exception verir
        dq1.pop(); // ilk elementi silip bize döner
        dq1.element();
        dq1.peekFirst();
        dq1.peekLast();
        dq1.offer("K"); */
        dq1.add("sahin");
        dq1.add("bmw");
        dq1.add("mercedes");
        String name = "";
        Deque<String> temp = new LinkedList<>();
        while (name !=null){
            name = dq1.poll();
            if(name!=null){
                name = "Y" + name;
                temp.add(name);
            }
        }
        dq1 = temp;
        System.out.println(dq1);
    }
}
