package Sample.activity;

import Sample.visitor.Visitor;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
public class Fitness implements Activity {
    int minutes;

    public Fitness(int minutes) {
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
