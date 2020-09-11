package task;

/**
 * Created by PZON_SM on 31.08.2020.
 **/
public class Gambler {
    GamblerState gamblerState;

    public Gambler() {
        gamblerState = new NoCoin();
    }

    public void noCoin(){
        gamblerState.insertCoin(this);
    }

    public void coinInserted(){
        gamblerState.pullTrigger(this);
    }

    public void wonLost(){
        gamblerState.winLoose(this);
    }


}
