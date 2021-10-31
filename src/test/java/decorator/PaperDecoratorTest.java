package decorator;

import flowerstore.FlowerBucket;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperDecoratorTest {
    ItemDecorator decorator;
    Item item;
    @BeforeEach
    void setUp() {
        item = new FlowerBucket();
        decorator = new PaperDecorator(item);
    }

    @Test
    void getPrice() {
        assertEquals(13, decorator.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals("this is a paper decorator. help me, world", decorator.getDescription());
    }
}