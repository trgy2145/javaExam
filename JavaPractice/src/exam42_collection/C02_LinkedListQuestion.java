package exam42_collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C02_LinkedListQuestion {
    static List<Double> noteList= new LinkedList<>();
    public static void main(String[] args) {
        addToNotList();
        double totalNote=0;
        double noteAvarage;
        int numberOfstudentUnderAvarage= 0;
        int tenPointUnderAndAboveAvarage = 0;
        for (Double each: noteList) {
            totalNote += each;

        }
        noteAvarage = totalNote/ noteList.size();

        for (Double each: noteList) {
            if (each< noteAvarage){
                numberOfstudentUnderAvarage ++;
            }
            if (each <noteAvarage+10 && each > noteAvarage-10) {
                tenPointUnderAndAboveAvarage ++;

            }

        }

        System.out.println(noteList);
        System.out.println(noteAvarage);
        System.out.println(numberOfstudentUnderAvarage);
        System.out.println(tenPointUnderAndAboveAvarage);


    }
    public static void addToNotList(){
        Scanner scan =  new Scanner(System.in);
        double not;
        boolean loop = true;

        while (loop){
            try {
                System.out.println("please enter grade of student");
                not = scan.nextDouble();
                noteList.add(not);
            }catch (Exception e){
                String input = scan.nextLine();

                if(input.equalsIgnoreCase("Q")){
                    break;
                }else {
                    System.out.println("please enter a number");
                }

            }
        }

    }
}
