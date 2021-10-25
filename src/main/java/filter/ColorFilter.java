package filter;

import flowerstore.Flower;

import java.util.ArrayList;
import java.util.Arrays;

public class ColorFilter extends FilterSpecification{
    private int[] color;

    ColorFilter(int[] color){
        this.color = color;
    }

    @Override
    protected ArrayList<Flower> applyFilter(ArrayList<Flower> flowers) {
        ArrayList<Flower> res = new ArrayList<>();
        for(Flower flower: flowers){
            if (Arrays.equals(flower.getColor(), color)){
                res.add(flower);
            }
        }
        return res;
    }
}
