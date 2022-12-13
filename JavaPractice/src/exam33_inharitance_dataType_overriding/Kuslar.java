package exam33_inharitance_dataType_overriding;

public class Kuslar extends Hayvanlar{
    protected void kanat(){
        System.out.println("kuslar kanatlıdırlar");
    }
    protected void solunum(){
        System.out.println("kuslar akciğer solunumu yaparlar");
    }
    protected void gaga(){
        System.out.println("kuslar gagaya sahiptir");
    }
    protected void cogalma(){
        System.out.println("kuslar yumurta ile cogalırlar");
    }
}
