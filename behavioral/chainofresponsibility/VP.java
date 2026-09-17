package behavioral.chainofresponsibility;

public class VP implements ExpenseHandler{

    private ExpenseHandler nextHandler;

    @Override
    public void setNextHandler(ExpenseHandler expenseHandler) {
        this.nextHandler = expenseHandler;
    }

    @Override
    public void approveExpense(double amount) {
        if(amount<=100000){
            System.out.println("VP approved ₹"+amount);
        } else if (nextHandler != null ){
            nextHandler.approveExpense(amount);
        }
    }
}
