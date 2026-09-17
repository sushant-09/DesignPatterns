package behavioral.chainofresponsibility;

public class Director implements ExpenseHandler{

    private ExpenseHandler nextHandler;

    @Override
    public void setNextHandler(ExpenseHandler expenseHandler) {
        this.nextHandler = expenseHandler;
    }

    @Override
    public void approveExpense(double amount) {
        if(amount<=50000){
            System.out.println("Director approved ₹"+amount);
        } else if (nextHandler != null) {
            nextHandler.approveExpense(amount);
        }
    }
}
