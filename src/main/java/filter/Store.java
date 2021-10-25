package filter;

import flowerstore.Flower;
import flowerstore.FlowerBucket;
import flowerstore.FlowerType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {
    List<FlowerBucket> flowerBuckets = new ArrayList<FlowerBucket>();
    private int buckets_count;

    public void add_bucket(FlowerBucket bucket){
        this.flowerBuckets.add(bucket);
    }
    public ArrayList<Flower> search(ArrayList<Flower> flowers, FilterSpecification filter){
        return filter.filter(flowers);
    }

}
