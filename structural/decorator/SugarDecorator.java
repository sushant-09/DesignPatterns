package structural.decorator;

public class SugarDecorator extends BeverageDecorator{

    public SugarDecorator(Bevarage bevarage) {
        super(bevarage);
    }

    @Override
    public double getCost(){
        return beverage.getCost() + 10;
    }

    @Override
    public String getDescription(){
        return beverage.getDescription() + ", sugar";
    }
}
