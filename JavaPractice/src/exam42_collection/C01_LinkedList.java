package exam42_collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C01_LinkedList {
    public static void main(String[] args) {

        System.out.println(" please enter first list of name");
        List<String> nameList1 = findCommonElements();
        System.out.println(" please enter second list of name");
        List<String> nameList2 = findCommonElements();
        System.out.println(nameList1);
        System.out.println(nameList2);
        nameList1.retainAll(nameList2);
        System.out.println(nameList1);


    }

    public static List<String> findCommonElements(){
        List<String> nameList = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        String name = "";
        while (!name.equalsIgnoreCase("0")){
            System.out.println("please enter name :");
            System.out.println("to exit please enter 0");
            name = scan.nextLine();
            if(!name.equalsIgnoreCase("0")){
                nameList.add(name);
            }
        }
        return nameList;
    }
}
