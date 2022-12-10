package exam30_31_inheritance;

public class Suv extends BinekArac {
    public static void main(String[] args) {
        Suv nevSuv =  new Suv();
        System.out.println(nevSuv.marka);
        System.out.println(nevSuv.model);
        System.out.println(nevSuv.plaka);
        System.out.println(nevSuv.yakit);
        System.out.println(nevSuv.yil);
        nevSuv.hiz();
        nevSuv.teker();

        Suv nevSuv2 = new Suv();
        nevSuv2.marka ="Toyota";
        nevSuv2.model = "HRV";
        nevSuv2.motor ="1.6";
        nevSuv2.plaka="21 DYB 21";
        nevSuv2.yakit = "benzin";
        nevSuv2.yil =2021;
        nevSuv2.hiz(nevSuv2.yakit);




    }
    public  static void hiz (String yakit){
        if(yakit.equalsIgnoreCase("benzin")){
            System.out.println("300 km speed");
        } else if (yakit.equalsIgnoreCase("dizel")) {
            System.out.println("240 km speed");
        } else if (yakit.equalsIgnoreCase("hibrit")) {
            System.out.println("hibrit suv max 220 km speed");
        }else {
            System.out.println("yakit belirlenmeli");
        }
    }



}
