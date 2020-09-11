package task.Visitor;

import task.Item.Animal;
import task.Item.Human;
import task.Item.Shipment;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
public class TransportVisitorInfo implements Visitor {
    @Override
    public void visit(Animal animal) {
        System.out.println("Shipment contain animal: "+animal.getBreed()+" weight: "+animal.getWeight());
    }

    @Override
    public void visit(Human human) {
        System.out.println("On deck is sitting person witn fName: "+human.getFirstName()+" sName: "+human.getLastName());
    }

    @Override
    public void visit(Shipment shipment) {
        System.out.println("Shipment contain package to: "+shipment.getPrefix()+" srl nr: "+shipment.getSerialNumber());
    }
}
