package Flower;

import Delivery.DeliveryWay;
import Payment.Payment;
import login.User;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class Order {
    private ArrayList<Bouqet> items;
    @Setter @Getter
    private Payment payment;
    @Setter @Getter
    private DeliveryWay delivery;

    public Order() {items = new ArrayList<>();}

    public void attachUser(User user){
        System.out.println("User succesfully attached");
    }

    public void deattachUser(User user){}

    public boolean process(){
        boolean status = payment.process(getPrice());
        status = status && delivery.prepare(this);
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