package filter;

import flowerstore.Flower;

import java.util.ArrayList;

public class PriceFilter extends FilterSpecification{
    private double price;

    public PriceFilter(double price){
        this.price = price;
    }

    @Override
    protected ArrayList<Flower> applyFilter(ArrayList<Flower> flowers) {
        ArrayList<Flower> res = new ArrayList<>();
        for(Flower flower: flowers){
            if (flower.getPrice() == price){
                res.add(flower);
            }
        }
        return res;
    }
}
