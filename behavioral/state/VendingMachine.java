package behavioral.state;

public class VendingMachine {

    private VendingMachineState state;

    public VendingMachine(){
        this.state = new IdleState(this);
    }

    public void setState(VendingMachineState state){
        this.state = state;
    }

    public void insertMoney(){
        state.insertMoney();
    }

    public void selectItem(){
        state.selectItem();
    }

    public void dispense(){
        state.dispense();
    }

}
