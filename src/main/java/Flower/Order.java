package Flower;

import Delivery.Delivery;
import Payment.Payment;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class Order {
    private ArrayList<Bouqet> items;
    @Setter @Getter
    private Payment payment;
    @Setter @Getter
    private Delivery delivery;

    public Order() {items = new ArrayList<>();}


    public boolean process(){
        boolean status = payment.process(getPrice());
        status = status && delivery.prepare();
        return status;

    }

    public double getPrice(){
        int price = 0;
        for(Bouqet bouquet: items){
            price += bouquet.getPrice();
        }
        return price;}

    public void addBouqet(Bouqet bouquet){
        items.add(bouquet);
      }
}