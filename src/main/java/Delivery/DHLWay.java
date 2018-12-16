package Delivery;

import Flower.Order;

public class DHLWay implements DeliveryWay{
    public boolean prepare(Order order) {
        System.out.println("Your order is processed.");
        return true;
    }
}
