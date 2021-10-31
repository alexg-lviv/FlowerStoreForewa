package decorator;

import flowerstore.FlowerBucket;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RibbonDecoratorTest {

    ItemDecorator decorator;
    Item item;
    @BeforeEach
    void setUp() {
        item = new FlowerBucket();
        decorator = new RibbonDecorator(item);
    }

    @Test
    void getPrice() {
        assertEquals(40, decorator.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals("its a ribbon decorator. help me, world", decorator.getDescription());
    }
}