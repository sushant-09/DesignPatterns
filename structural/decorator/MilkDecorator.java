package structural.decorator;

public class MilkDecorator extends BeverageDecorator{

    public MilkDecorator(Bevarage bevarage) {
        super(bevarage);    //because the parent class does not have a default constructor
    }

    @Override
    public double getCost(){
        return beverage.getCost() + 15;
    }

    @Override
    public String getDescription(){
        return beverage.getDescription() + ", Milk";
    }

}