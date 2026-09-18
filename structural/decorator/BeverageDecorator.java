package structural.decorator;

public class BeverageDecorator implements Bevarage{

    protected Bevarage beverage; // so that child classes can access it

    public BeverageDecorator(Bevarage bevarage){
        this.beverage = bevarage;
    }

    @Override
    public double getCost() {
        return 0;
    }

    @Override
    public String getDescription() {
        return "";
    }
}
