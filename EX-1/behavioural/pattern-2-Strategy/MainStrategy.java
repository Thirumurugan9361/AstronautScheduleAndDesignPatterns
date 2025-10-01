public class MainStrategy {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        context.setStrategy(new CreditCardPayment("1234"));
        context.pay(100);
        context.setStrategy(new PayPalPayment("test@demo.com"));
        context.pay(200);
    }
}