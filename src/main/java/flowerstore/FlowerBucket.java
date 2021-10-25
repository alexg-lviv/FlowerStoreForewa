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

    public double getPrice(){
        double res = 0;
        for(int i=0; i<flowerPacks.size(); i++){
            res += flowerPacks.get(i).getPrise();
        }
        return res;
    }
}