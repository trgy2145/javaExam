package exam32_inharitance_const_call;

public class Corolla extends Toyota{
    Corolla(){
        System.out.println("parametresiz Corolla const");
    }
    Corolla(int a){
        super(5);
        System.out.println("parametreli Corolla const");
    }
    Corolla(String str){
        this();
        System.out.println("String parametreli Corolla const");
    }
    public static void main(String[] args) {
        Corolla cor1 = new Corolla();
        System.out.println("*******************************");
        Corolla cor2 = new Corolla(5);
        System.out.println("*******************************");
        Corolla cor3 = new Corolla("ali");
    }
}
