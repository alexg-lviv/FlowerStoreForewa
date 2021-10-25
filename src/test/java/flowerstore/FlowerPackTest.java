package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private Flower flower;
    private FlowerPack pack;
    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(10);
        pack = new FlowerPack();
    }
    @Test
    void setFlower() {
        pack.setFlower(flower);
        assertEquals(flower, pack.getFlower());
    }

    @Test
    void setAmount() {
        pack.setAmount(10);
        assertEquals(10, pack.getAmount());
    }

    @Test
    void getPrise() {
        pack.setFlower(flower);
        pack.setAmount(10);
        assertEquals(100, pack.getPrise());
    }
}