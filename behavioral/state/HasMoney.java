package behavioral.state;

public class HasMoney implements VendingMachineState {

    private VendingMachine vendingMachine;

    public HasMoney(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }
    @Override
    public void insertMoney() {
        System.out.println("Money is already inserted");
    }

    @Override
    public void selectItem() {
        System.out.println("Item selected");
        vendingMachine.setState(new DispensingState(vendingMachine));
    }

    @Override
    public void dispense() {
        System.out.println("Please select an item first");
    }
}
