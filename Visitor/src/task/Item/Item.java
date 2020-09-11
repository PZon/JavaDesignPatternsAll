package task.Item;

import task.Visitor.Visitor;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
public interface Item {
    void accept(Visitor visitor);
}
