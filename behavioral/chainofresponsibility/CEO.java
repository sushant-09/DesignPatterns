package behavioral.chainofresponsibility;

public class CEO implements ExpenseHandler{

    private ExpenseHandler nextHandler;

    @Override
    public void setNextHandler(ExpenseHandler expenseHandler) {
        this.nextHandler = expenseHandler;
    }

    @Override
    public void approveExpense(double amount) {
        System.out.println("CEO approved ₹" +amount);
    }
}
