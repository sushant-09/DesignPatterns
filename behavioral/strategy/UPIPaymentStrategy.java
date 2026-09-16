package behavioral.strategy;

public class UPIPaymentStrategy implements PaymentStrategy{

    @Override
    public void pay(double amount){
        System.out.println("amount paid using UPI: ₹"+amount);
    }

}
