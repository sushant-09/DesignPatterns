package behavioral.chainofresponsibility;

public class Manager implements ExpenseHandler{

    private ExpenseHandler nextHandler;

    @Override
    public void setNextHandler(ExpenseHandler expenseHandler) {
        this.nextHandler = expenseHandler;
    }

    @Override
    public void approveExpense(double amount) {
        if(amount<=10000){
            System.out.println("Manager approved ₹" + amount);
        } else if (nextHandler != null ) {
            nextHandler.approveExpense(amount);
        }
    }
}
