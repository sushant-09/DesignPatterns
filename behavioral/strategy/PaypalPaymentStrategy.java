package behavioral.strategy;

public class PaypalPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("amount paid using Paypal: ₹"+amount);
    }
}
