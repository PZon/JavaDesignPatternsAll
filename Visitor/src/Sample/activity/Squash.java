package Sample.activity;

import Sample.visitor.Visitor;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
public class Squash implements Activity {
    private int minutesPlayed;

    public Squash(int minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public int getMinutesPlayed() {
        return minutesPlayed;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
