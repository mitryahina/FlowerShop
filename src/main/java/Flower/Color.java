package Flower;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public enum Color {
    RED("F00"), WHITE("#FFF"), PURPLE("#FOF"), BLUE("#00F");

    private String rgb;
    Color(String rgb){this.rgb = rgb;}
}

