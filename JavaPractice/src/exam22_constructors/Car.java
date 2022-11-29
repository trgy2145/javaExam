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
