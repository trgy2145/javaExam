package exam30_31_inheritance;

public class Arac {
    protected  String motor = "tüm araclar motor kullanır";
    protected  String plaka = "tüm aracların plakası olur";
    protected  String yakit = "farklı yakitlar kullanılabilir";

    protected void teker(){
        System.out.println("arac türüne göre teker sayısı değişir..");
    }
}
