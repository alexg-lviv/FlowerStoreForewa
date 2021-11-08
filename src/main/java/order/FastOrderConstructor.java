package order;

import delivery.Delivery;
import delivery.PostDeliveryStrategy;
import flowerstore.*;
import payment.PayPalPaymentStrategy;
import payment.Payment;

import java.util.ArrayList;
import java.util.LinkedList;

public enum FastOrderConstructor{
    ROSE_BUCKET(FlowerType.ROSE, 5),
    TULIP_BUCKET(FlowerType.TULIP, 15),
    CHAMOMILE_BUCKET(FlowerType.CHAMOMILE, 10);
    private FlowerType type;
    private int price;

    FastOrderConstructor(FlowerType type, int price) {this.type = type; this.price = price;}

    private FlowerType getType(){return this.type;}
    private int getPrice(){return price;}

    public static Order createOrder(FastOrderConstructor bucket_type, int num_of_roses){
        Flower flower = new Flower(bucket_type.getType());
        flower.setPrice(bucket_type.getPrice());
        FlowerPack pack = new FlowerPack();
        pack.setFlower(flower);
        pack.setAmount(num_of_roses);
        FlowerBucket bucket = new FlowerBucket();
        ArrayList<FlowerPack> packList = new ArrayList<>();
        packList.add(pack);
        bucket.setFlowerPacks(packList);
        Delivery del_strat = new PostDeliveryStrategy();
        Payment pay_strat = new PayPalPaymentStrategy();
        LinkedList<Item> items_arr = new LinkedList<>();
        items_arr.add(bucket);
        return new Order(items_arr, pay_strat, del_strat);
    }
}
