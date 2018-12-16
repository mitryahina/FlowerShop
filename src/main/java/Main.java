import Delivery.CourierDelivery;
import Flower.Bouqet;
import Flower.Flower;
import Flower.Color;
import Flower.FlowerType;
import Flower.Order;
import Payment.CardPayment;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Bouqet hundredRoses = new Bouqet();
        for (int i = 0; i < 100; i++){
            hundredRoses.addFlower(new Flower(12, Color.RED, FlowerType.ROSE, "Netherlands"));
        }
        Bouqet Tulips = new Bouqet();
        for (int i = 0; i < 21; i++){
            Tulips.addFlower(new Flower(8, Color.RED, FlowerType.TULIP, "Netherlands"));
        }
        Bouqet Camomiles = new Bouqet();
        for (int i = 0; i < 31; i++){
           Camomiles.addFlower(new Flower(6, Color.WHITE, FlowerType.CAMOMILE, "Ukraine"));
        }
        Bouqet[] defaultBouqets = {hundredRoses, Tulips, Camomiles};
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Order one of the default bouquets \n2. Form a new one");
        int action = sc.nextInt();
        while (!(action==1 || action==2)){
            System.out.println("Wrong input. Try again: ");
            action = sc.nextInt();
        }

        if(action == 1){
            for(int i = 0; i < defaultBouqets.length; i++){
                System.out.println(i + ". " + defaultBouqets[i]);
            }
            System.out.println("Enter the number of the bouqet you want to order: ");
            action = sc.nextInt();
            if (action >= 0 && action < defaultBouqets.length){
                System.out.println("We are processing your order ");
                Order newOrder = new Order();
                newOrder.addBouqet(defaultBouqets[action]);
                newOrder.setPayment(new CardPayment());
                newOrder.setDelivery(new CourierDelivery());
                System.out.println(newOrder.process());
            }
        }

    }
}
