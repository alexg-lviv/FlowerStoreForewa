package decorator;

import flowerstore.Item;

public class PaperDecorator extends ItemDecorator{
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 13 + super.getPrice();
    }

    @Override
    public String getDescription() {
        return "this is a paper decorator. help me, world";
    }
}
