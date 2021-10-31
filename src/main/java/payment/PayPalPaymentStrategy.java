package payment;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public String pay(double price) {
        return "you wanna pay via paypal?! ok. help me world, btw";
    }
}
