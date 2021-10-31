package payment;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public String pay(double price) {
        return "you wanna pay with your credit card?! ok. help me world, btw";
    }
}
