package flowerstore;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class FlowerPack {
    public Flower flower;
    private int amount;
    public double getPrise(){
        return flower.getPrice() * amount;
    }
}