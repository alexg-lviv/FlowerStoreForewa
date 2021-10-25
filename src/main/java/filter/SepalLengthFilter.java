package filter;

import flowerstore.Flower;

import java.util.ArrayList;

public class SepalLengthFilter extends FilterSpecification{
    private double len;

    SepalLengthFilter(double len){
        this.len = len;
    }

    @Override
    protected ArrayList<Flower> applyFilter(ArrayList<Flower> flowers) {
        ArrayList<Flower> res = new ArrayList<>();
        for(Flower flower: flowers){
            if (flower.getSepalLength() == len){
                res.add(flower);
            }
        }
        return res;
    }
}
