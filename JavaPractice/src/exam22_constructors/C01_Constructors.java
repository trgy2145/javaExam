package exam22_constructors;

public class C01_Constructors {
    public static void main(String[] args) {
      Car car1 = new Car();
      car1.fuel = "dizel";
      car1.model = "bmw";
      car1.year = 2020;
      car1.price = 50000;

        System.out.println(car1.maxSpeed(car1.model));
        System.out.println(car1);

    }
}
