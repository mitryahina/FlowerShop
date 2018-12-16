package Delivery;

import Flower.Order;

public class CourierDelivery implements DeliveryWay{

    public boolean prepare(Order order){
        System.out.println("Your order is prepared! ");
        return true;
    }
}
