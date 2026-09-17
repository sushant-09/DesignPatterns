package behavioral.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        ExpenseHandler manager = new Manager();
        ExpenseHandler director = new Director();
        ExpenseHandler vp = new VP();
        ExpenseHandler ceo = new CEO();

        manager.setNextHandler(director);
        director.setNextHandler(vp);
        vp.setNextHandler(ceo);

        manager.approveExpense(5_000);
        manager.approveExpense(30_000);
        manager.approveExpense(80_000);
        manager.approveExpense(200_000);
    }
}
