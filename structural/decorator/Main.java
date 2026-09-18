package structural.decorator;

public class Main {

    public static void main(String[] args) {

        Bevarage coffee = new Coffee();
        Bevarage milkCoffee = new MilkDecorator(coffee);
        Bevarage sugarMilkCoffee = new SugarDecorator(milkCoffee);

        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());

        System.out.println(milkCoffee.getDescription());
        System.out.println(milkCoffee.getCost());

        System.out.println(sugarMilkCoffee.getDescription());
        System.out.println(sugarMilkCoffee.getCost());
    }
}
