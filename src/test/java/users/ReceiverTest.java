package users;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReceiverTest {
    Receiver user1 = new Receiver();
    Receiver user2 = new Receiver();
    @Test
    void getId() {
        assertEquals(1, user2.getId() - user1.getId());
    }

    @Test
    void update() {
        assertEquals("wow, my order was handled", user1.update(1));
    }
}