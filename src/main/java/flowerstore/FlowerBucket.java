package flowerstore;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter@Setter
public class FlowerBucket {
    List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();

    public void add_flower_pack(FlowerPack flowerPack){
        flowerPacks.add(flowerPack);
    }

    public int count_flowers(FlowerType flower){
        int res = 0;
        for(int i=0; i<flowerPacks.size();i++){
            if(flowerPacks.get(i).flower.getFlowerType() == flower){
                res += flowerPacks.get(i).getAmount();
            }
        }
        return res;
    }

    public double getPrice(){
        double res = 0;
        for(int i=0; i<flowerPacks.size(); i++){
            res += flowerPacks.get(i).getPrise();
        }
        return res;
    }
}