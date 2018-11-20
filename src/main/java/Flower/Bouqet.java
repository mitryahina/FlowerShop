package Flower;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@ToString
public class Bouqet {
    private HashMap<Flower, Integer> flowers = new HashMap<Flower, Integer>();
    private int price;

    public void addFlower(Flower fl){
        if(flowers.containsKey(fl)){
            flowers.put(fl, flowers.get(fl) + 1);
        }
        else{
            flowers.put(fl, 1);
        }
    }

    public double getPrice(){
        for (Map.Entry<Flower, Integer> entry : flowers.entrySet()) {
            Flower key = entry.getKey();
            Integer quantity = entry.getValue();
            price += key.getPrice() * quantity;
        }
        return price;
    }
}
