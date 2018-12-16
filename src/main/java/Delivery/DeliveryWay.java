package Delivery;

import Flower.Order;

public interface DeliveryWay {
    boolean prepare(Order order);
}
