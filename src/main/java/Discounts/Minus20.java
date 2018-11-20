package Discounts;

import Flower.Order;

public class Minus20 extends Discount{

        public  Minus20(Order order){
            super(order);
        }

        @Override
        public double getPrice(){
            return super.getPrice() * 0.8;
        }
    }

