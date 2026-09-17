package behavioral.state;

public class IdleState implements VendingMachineState{

    private VendingMachine vendingMachine;

    public IdleState (VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Money Inserted");
        vendingMachine.setState(new HasMoney(vendingMachine));
    }

    @Override
    public void selectItem() {
        System.out.println("Please insert money first");
    }

    @Override
    public void dispense() {
        System.out.println("Please insert money first");
    }
}
