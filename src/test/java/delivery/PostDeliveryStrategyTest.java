package delivery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PostDeliveryStrategyTest {
    Delivery delivery;

    @Test
    void deliver() {
        delivery = new PostDeliveryStrategy();
        ArrayList list = new ArrayList();

        assertEquals("help me, world. and yeah, your bucket will be delivered by post", delivery.deliver(list));
    }
}