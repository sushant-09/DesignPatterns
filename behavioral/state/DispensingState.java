package behavioral.state;

public class DispensingState implements VendingMachineState{

    private VendingMachine vendingMachine;

    public DispensingState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }
    @Override
    public void insertMoney() {
        System.out.println("Please wait, dispensing item");
    }

    @Override
    public void selectItem() {
        System.out.println("Please wait, dispensing item");
    }

    @Override
    public void dispense() {
        System.out.println("Item dispensed");
        vendingMachine.setState(new IdleState(vendingMachine));
    }
}
