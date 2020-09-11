package task;

import task.Item.Animal;
import task.Item.Human;
import task.Item.Item;
import task.Item.Shipment;
import task.Visitor.TransportPrice;
import task.Visitor.TransportVisitorInfo;

import java.util.Arrays;
import java.util.List;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
public class TransportDemo {
    public static void main(String[] args) {
        Animal animal = new Animal("dog", 21);
        Human human = new Human("Unknown", "lastName", true);
        Shipment shipment = new Shipment("CAN", 123456, true);

        TransportVisitorInfo transportVisitorInfo = new TransportVisitorInfo();
        TransportPrice transportPrice = new TransportPrice();

        List<Item> items = Arrays.asList(animal, human, shipment);
        items.forEach(info -> info.accept(transportVisitorInfo));
        System.out.println("==================================================================================");
        items.forEach(price -> price.accept(transportPrice));
    }
}
