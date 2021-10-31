package payment;

import delivery.DHLDeliveryStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {
    Payment payment;
    @Test
    void pay() {
        payment = new CreditCardPaymentStrategy();
        assertEquals("you wanna pay with your credit card?! ok. help me world, btw", payment.pay(10));
    }
}