package Sample.visitor;

import Sample.activity.Fitness;
import Sample.activity.Squash;
import Sample.activity.Weights;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
public interface Visitor {
    void visit(Fitness fitness);
    void visit(Squash squash);
    void visit(Weights weights);
}
