package creational.prototype;

public class Car {

    private String engine;  //if this was private Engine engine - this implementation would only create it's shallow copy
    private String colour;
    private int seats;

    public Car(){

    }
    public Car(String engine, String colour, int seats) {
        this.engine = engine;
        this.colour = colour;
        this.seats = seats;
    }

    public Car clone(){
        Car clonedCar = new Car();
        clonedCar.engine = this.engine;
        clonedCar.colour = this.colour;
        clonedCar.seats = this.seats;
        return clonedCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", colour='" + colour + '\'' +
                ", seats=" + seats +
                '}';
    }


}
