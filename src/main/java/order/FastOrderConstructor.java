package order;

import delivery.Delivery;
import delivery.PostDeliveryStrategy;
import flowerstore.*;
import payment.PayPalPaymentStrategy;
import payment.Payment;

import java.util.ArrayList;
import java.util.LinkedList;

enum FastOrderConstructor{
    ROSE_BUCKET(FlowerType.ROSE),
    TULIP_BUCKET(FlowerType.TULIP),
    CHAMOMILE_BUCKET(FlowerType.CHAMOMILE);
    private FlowerType type;

    FastOrderConstructor(FlowerType type) {this.type = type;}

    private FlowerType getType(){return this.type;}

    public static Order createOrder(FastOrderConstructor bucket_type, int num_of_roses, int price){
        Flower flower = new Flower(bucket_type.getType());
        flower.setPrice(price);
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
