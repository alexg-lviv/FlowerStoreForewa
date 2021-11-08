package order;

import delivery.Delivery;
import delivery.PostDeliveryStrategy;
import flowerstore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import payment.PayPalPaymentStrategy;
import payment.Payment;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class FastOrderConstructorTest {
    @Test
    void createOrder() {
        Order order = FastOrderConstructor.createOrder(FastOrderConstructor.ROSE_BUCKET, 5);
        assertEquals(25, order.calculateTotalPrice());
    }
}