package filter;

import flowerstore.Flower;

import java.util.ArrayList;

public abstract class FilterSpecification{
    public ArrayList<Flower> filter(ArrayList<Flower> flowers){
        return applyFilter(flowers);
    }
    protected abstract ArrayList<Flower> applyFilter(ArrayList<Flower> flowers);
}
