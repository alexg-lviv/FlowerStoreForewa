package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {
    Payment payment;

    @Test
    void pay() {
        payment = new PayPalPaymentStrategy();
        assertEquals("you wanna pay via paypal?! ok. help me world, btw", payment.pay(10));
    }
}