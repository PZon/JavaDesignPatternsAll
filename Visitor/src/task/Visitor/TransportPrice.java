package task.Visitor;

import task.Item.Animal;
import task.Item.Human;
import task.Item.Shipment;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
public class TransportPrice implements Visitor {
    @Override
    public void visit(Animal animal) {
        int price=0;
        if(animal.getWeight()>20){
           price=100;
        }else{
            price=75;
        }
        System.out.println("Shipment price for animal with weight: "+animal.getWeight()+" is: "+price+"$");
    }

    @Override
    public void visit(Human human) {
        int price=0;
        if(human.isRegularCustomer()) {
            price = 130;
            System.out.println("Transport for regular customer costs: "+price+"$");
        } else{
            price = 200;
            System.out.println("Standard transport fee is: "+price+"$");
        }


    }

    @Override
    public void visit(Shipment shipment) {
        int price=3;
        if(shipment.isLarge()) price = price*2;
        System.out.println("Price per kilometer is: "+price+"$");
    }
}
