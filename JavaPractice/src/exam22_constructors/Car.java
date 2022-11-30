package exam22_constructors;

public class Car {
    String model;
    String fuel ;
    int year;
    int price;

    @Override
    public String toString() {
        return "my Car" +
                "model :" + model +
                "\nfuel :" + fuel +
                "\nyear :" + year +
                "\nprice :" + price
                ;
    }

    public Car(String model, String fuel, int year, int price) {
        this.model = model;
        this.fuel = fuel;
        this.year = year;
        this.price = price;
    }

    public Car(String model, String fuel, int year) {
        this.model = model;
        this.fuel = fuel;
        this.year = year;
    }

    public Car(){
        // daha önce defaultla const olusturduk simdi parametreli const olusturduk hata vermemesi icin yaptık
    }

    public int maxSpeed(String model){
        int maxSpeed=120;
        if (model.equalsIgnoreCase("bmw")) {
            maxSpeed = 200;
        } else if (model.equalsIgnoreCase("porsche")) {
            maxSpeed=250;
        } else if (model.equalsIgnoreCase("sahin")) {
            maxSpeed=400;
        }
        return maxSpeed;
    }

}
