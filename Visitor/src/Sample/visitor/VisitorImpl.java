package Sample.visitor;

import Sample.activity.Fitness;
import Sample.activity.Squash;
import Sample.activity.Weights;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
public class VisitorImpl implements Visitor {
    @Override
    public void visit(Fitness fitness) {
        System.out.println("Cals burned on fitness: "+fitness.getMinutes()*20);
    }

    @Override
    public void visit(Squash squash) {
        System.out.println("Cals burned playing: "+squash.getMinutesPlayed()*27);
    }

    @Override
    public void visit(Weights weights) {
        System.out.println("Cals burned lifting bars: "+(weights.getWeight()+weights.getReps())*20);
    }
}
