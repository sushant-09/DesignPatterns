package creational.builder;

public class Main {
    public static void main(String[] args){
        Car car = new Car.CarBuilder()
                .setColour("red")
                .setEngine("1.5 turbo")
                .setSeats(5)
                .setSunroof(true)
                .setTransmission("DCT")
                .build();

        System.out.println("car created successfully");
        System.out.println(car);

        Car car1 = new Car.CarBuilder().setColour("red").build();
        System.out.println("red car created with default values");
        System.out.println(car1);

    }
}
