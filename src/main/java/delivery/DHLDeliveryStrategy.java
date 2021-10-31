package delivery;

import flowerstore.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public String deliver(List<Item> items) {
        return "help me world! and yeah, what is DHL?!";
    }
}
