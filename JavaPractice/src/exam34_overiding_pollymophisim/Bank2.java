package exam34_overiding_pollymophisim;

public class Bank2 extends Bank1{
    int getRateOfInterest(){
        return 10;
    }

    @Override
    void className() {
        super.className();
        System.out.println("my class  name Bank2");
    }

    public static void main(String[] args) {
        Bank rate =  new Bank2();
        System.out.println(rate.getRateOfInterest());
        rate.className();


    }
}
