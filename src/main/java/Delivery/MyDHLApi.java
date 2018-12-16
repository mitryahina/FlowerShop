package Delivery;

import Flower.Order;

public class MyDHLApi extends DHLAPI {
    public String CreateOrder(Order order){
        return eineBestellungErstellen(order);
    }

    public boolean send(String id){
        return senden(id);
    }

    public boolean checkAvailability(String id){
        return verfugbarkeitPrufen(id);
    }

}
