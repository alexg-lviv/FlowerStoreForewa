package filter;

import flowerstore.Flower;

import java.util.ArrayList;

public class Store {

    public ArrayList<Flower> search(ArrayList<Flower> flowers, FilterSpecification filter){
        return filter.filter(flowers);
    }

}
