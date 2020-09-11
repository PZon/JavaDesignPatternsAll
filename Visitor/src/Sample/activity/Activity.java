package Sample.activity;

import Sample.visitor.Visitor;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
public interface Activity {
    void accept(Visitor visitor);
}
