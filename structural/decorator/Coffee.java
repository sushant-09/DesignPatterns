package structural.decorator;

public class Coffee implements Bevarage {
    @Override
    public double getCost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "This is a coffee";
    }
}
