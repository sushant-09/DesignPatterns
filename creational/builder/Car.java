package creational.builder;

public class Car {

    private String engine;
    private boolean sunroof;
    private String colour;
    private int seats;
    private String transmission;

    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.sunroof = builder.sunroof;
        this.colour = builder.colour;
        this.seats = builder.seats;
        this.transmission = builder.transmission;
    }

    public static class CarBuilder {

        private String engine;
        private boolean sunroof;
        private String colour;
        private int seats;
        private String transmission;

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public CarBuilder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public CarBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public CarBuilder setTransmission(String transmission) {
            this.transmission = transmission;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString(){
        return "Car{" +
                "engine='" + engine + '\'' +
                ", sunroof=" + sunroof +
                ", colour='" + colour + '\'' +
                ", seats=" + seats +
                ", transmission='" + transmission + '\'' +
                '}';
    }
}