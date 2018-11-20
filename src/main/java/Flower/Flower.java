package Flower;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString

public class Flower {
    private float price;
    private Color color;
    private FlowerType type;
    private String country;
}
