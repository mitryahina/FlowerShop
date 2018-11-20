package Discounts;

import Flower.Order;


public class PromocodeDiscount extends Discount {

    private static String validPromo = "flowers";
    public  PromocodeDiscount (Order order){
        super(order);
    }

    @Override
    public double getPrice(){
        return super.getPrice() * 0.7;}

    public static boolean validate(String promo){return promo.equals(validPromo);
    }}
