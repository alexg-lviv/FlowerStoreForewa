package flowerstore;

import filter.FilterSpecification;
import filter.PriceFilter;
import filter.Store;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private Flower flower;
    private Flower flower1;
    private Flower flower2;

    private FlowerPack pack;
    private FlowerBucket bucket;
    private Store store;
    private FilterSpecification filter;
    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(10);
        flower1 = new Flower(FlowerType.ROSE);
        flower1.setPrice(10);
        flower2 = new Flower(FlowerType.ROSE);
        flower2.setPrice(10);
        store = new Store();
    }

    @Test
    void search() {
        filter = new PriceFilter(10);
        ArrayList<Flower> list = new ArrayList<Flower>();
        list.add(flower);
        list.add(flower1);
        list.add(flower2);
        assertEquals(3, store.search(list, filter).size());
    }
}