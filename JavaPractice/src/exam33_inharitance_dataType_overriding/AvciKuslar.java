package exam33_inharitance_dataType_overriding;

public class AvciKuslar extends Kuslar{
    public void hareket(){
        System.out.println("Avcı kuslar ucarlar");
    }
    public void beslenme(){
        System.out.println("Avcı kuslar et yerler");
    }
    public void pence(){
        System.out.println("Avcı kuslar pencelidir");
    }
    public void gaga(){
        System.out.println("Avcı kuslar sivri gagalıdır");
    }

    public static void main(String[] args) {
        AvciKuslar avci1 = new AvciKuslar();
        avci1.kanat();// kuslar
        avci1.beslenme();// avcı kuslar
        avci1.hareket(); // avcı kuslar
        avci1.cogalma();// kuslar
        avci1.pence();// avcı kuslar
        avci1.omur(); // hayvanlar
        avci1.solunum();//kuslar
        avci1.gaga(); // avcı kuslar

        System.out.println("********************************");
        Kuslar avci2 = new AvciKuslar();
        avci2.kanat();//kuslarda var bir üste bakma connst kısmına bak
        avci2.beslenme();// normalde parent olan hayvanlar clasında var ancak avcıkuslar sınıfında override edilmisi var yanı daha günceli onu alırız
        avci2.hareket(); //avcı kuslar
        avci2.cogalma();//daha günceli yok kuslar sınıfından alınır
        // avci2.pence();//ne data türü sınıfı nede parente yok CTE, olsaydı override haiı alınırdı.
        avci2.omur(); //hayvanlar
        avci2.solunum();//kuslar
        avci2.gaga(); //normalde kuslarda var ama avcı kuslarda daha günceli var

        System.out.println("***********************************************");
        Hayvanlar avci3 = new AvciKuslar();
        avci3.beslenme();// hayvanlarda var simdi subclasslara bak varsa onu al, avcı kuslar sınıfından alır
       //  avci3.gaga(); CTE verir
       // avci3.pence(); CTE verir
        avci3.cogalma(); // kuslar sınıfındaki cogalma gecerli
        // avci3.kanat(); CTE
        avci3.omur(); // hayvanlar
        avci3.solunum();// kuslar sınıfı
    }
}
