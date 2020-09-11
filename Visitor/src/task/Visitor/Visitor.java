package task.Visitor;

import task.Item.Animal;
import task.Item.Human;
import task.Item.Shipment;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
public interface Visitor {
    void visit(Animal animal);
    void visit(Human human);
    void visit(Shipment shipment);
}
