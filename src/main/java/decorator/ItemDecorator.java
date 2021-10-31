package decorator;

import flowerstore.Item;

public class ItemDecorator extends Item {
    private Item item;
    public ItemDecorator(Item item){
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }
}
