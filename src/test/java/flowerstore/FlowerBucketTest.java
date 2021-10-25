package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private Flower flower;
    private FlowerPack pack;
    private FlowerBucket bucket;
    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(10);
        pack = new FlowerPack();
        pack.setFlower(flower);
        pack.setAmount(10);
        bucket = new FlowerBucket();
    }

    @Test
    void add_flower_pack() {
        bucket.add_flower_pack(pack);
        ArrayList<FlowerPack> list = new ArrayList<FlowerPack>();
        list.add(pack);
        assertEquals(list, bucket.getFlowerPacks());
    }

    @Test
    void getPrice() {
        bucket.add_flower_pack(pack);
        assertEquals(100, bucket.getPrice());
    }
}