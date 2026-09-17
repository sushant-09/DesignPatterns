package behavioral.chainofresponsibility;

public interface ExpenseHandler {
    void setNextHandler(ExpenseHandler expenseHandler);
    void approveExpense(double amount);
}
