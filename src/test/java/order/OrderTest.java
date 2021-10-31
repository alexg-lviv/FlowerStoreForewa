package order;

import flowerstore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Order order;
    Item flower;
    Item bucket;
    FlowerPack pack;
    @BeforeEach
    void setUp() {
        order = new Order();
        flower = new Flower(FlowerType.ROSE);
        bucket = new FlowerBucket();
        pack = new FlowerPack();
        ((Flower) flower).setPrice(10);
        pack.setFlower((Flower) flower);
        pack.setAmount(5);
    }

    @Test
    void calculateTotalPrice() {
        ((FlowerBucket) bucket).add_flower_pack(pack);
        order.addItem(bucket);
        assertEquals(50, order.calculateTotalPrice());
    }

    @Test
    void processOrder() {
        assertEquals("your order was processed. help me world btw", order.processOrder());
    }
}