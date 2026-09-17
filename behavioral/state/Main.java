package behavioral.state;

public class Main {
    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.selectItem();

        vendingMachine.insertMoney();
        vendingMachine.selectItem();
        vendingMachine.dispense();

        vendingMachine.selectItem();
        vendingMachine.dispense();
    }
}
