package Delivery;

public class CourierDelivery implements Delivery{

    public boolean prepare(){
        System.out.println("Your order is prepared! ");
        return true;
    }
}
