package behavioral.strategy;

import java.nio.file.FileSystemNotFoundException;

public class CardPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("amount paid using card: ₹"+amount);
    }

}
