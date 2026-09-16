package creational.prototype;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("V8", "Black", 5);
        Car car2 = car1.clone();
        System.out.println("Original: " + car1);
        System.out.println("Clone: " + car2);
        System.out.println(car1 == car2);
        Car car3 = car1;
        System.out.println(car1==car3);

    }
}
