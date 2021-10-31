package decorator;

import flowerstore.Flower;
import flowerstore.FlowerBucket;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketDecoratorTest {
    ItemDecorator decorator;
    Item item;
    @BeforeEach
    void setUp() {
        item = new FlowerBucket();
        decorator = new BasketDecorator(item);
    }

    @Test
    void getPrice() {
        assertEquals(4, decorator.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals("this is a bucket decorator. help me world", decorator.getDescription());
    }
}