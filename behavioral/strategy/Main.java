package behavioral.strategy;

public class Main {
    public static void main(String[] args) {

        PaymentStrategy upi = new UPIPaymentStrategy();
        PaymentStrategy paypal = new PaypalPaymentStrategy();
        PaymentStrategy card = new CardPaymentStrategy();

        PaymentProcessor processor = new PaymentProcessor(upi);

        processor.processPayment(250);

        processor.setPaymentStrategy(paypal);
        processor.processPayment(350);

        processor.setPaymentStrategy(card);
        processor.processPayment(450);

    }
}
