package flowerstore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        flower.setPrice(10);
        assertEquals(10, flower.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getColor() {
        flower.setColor(new int[]{0, 255, 0});
        assertArrayEquals(new int[]{0, 255, 0}, flower.getColor());
    }

    @org.junit.jupiter.api.Test
    void getSepalLength() {
        flower.setSepalLength(20);
        assertEquals(20, flower.getSepalLength());
    }

    @Test
    void testToString() {
        assertEquals("Flower{price=0.0, sepalLength=0.0, color=null, flowerType=ROSE}", flower.toString());
    }
}