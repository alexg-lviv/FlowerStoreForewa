package delivery;

import flowerstore.Item;

import java.util.List;

public interface Delivery {
    String deliver(List<Item> items);
}
