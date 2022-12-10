package exam30_31_inheritance;

public class BinekArac extends Arac {
    protected String model = "aracların markası olur";
    protected String marka = "aracların markası olur";
    protected int yil = 1990;
    protected void hiz(){
        System.out.println("hizlari değişebilir..");
    }
    protected void teker(){
        System.out.println("binek aracların 4 tekeri olur..");
    }
}
