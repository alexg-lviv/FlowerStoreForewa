package filter;

import flowerstore.Flower;
import flowerstore.FlowerType;

import java.util.ArrayList;

public class TypeFilter extends FilterSpecification{
    FlowerType type;

    TypeFilter(FlowerType type){
        this.type = type;
    }

    @Override
    protected ArrayList<Flower> applyFilter(ArrayList<Flower> flowers) {
        ArrayList<Flower> res = new ArrayList<>();
        for(Flower flower: flowers){
            if (flower.getFlowerType() == type){
                res.add(flower);
            }
        }
        return res;
    }
}
