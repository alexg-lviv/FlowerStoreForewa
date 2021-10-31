package delivery;

import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {
    Delivery delivery;

    @Test
    void deliver() {
        delivery = new DHLDeliveryStrategy();
        ArrayList list = new ArrayList();

        assertEquals("help me world! and yeah, what is DHL?!", delivery.deliver(list));
    }
}