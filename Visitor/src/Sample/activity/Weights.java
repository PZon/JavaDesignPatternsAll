package Sample.activity;

import Sample.visitor.Visitor;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
public class Weights implements Activity {
    int reps;
    int weight;

    public Weights(int reps, int weight) {
        this.reps = reps;
        this.weight = weight;
    }

    public int getReps() {
        return reps;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
