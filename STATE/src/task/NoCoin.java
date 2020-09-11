package task;

/**
 * Created by PZON_SM on 31.08.2020.
 **/
public class NoCoin implements GamblerState {
    @Override
    public void insertCoin(Gambler gambler) {
        System.out.println("coin inserted - pull trigger");
        gambler.gamblerState = new PullTrigger();
    }


    @Override
    public void pullTrigger(Gambler gambler) {
        System.out.println("Insert coin first");
    }

    @Override
    public void winLoose(Gambler gambler) {
        System.out.println("Insert coin first");
    }
}
