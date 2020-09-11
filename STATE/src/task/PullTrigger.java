package task;

/**
 * Created by PZON_SM on 31.08.2020.
 **/
public class PullTrigger implements GamblerState {
    @Override
    public void insertCoin(Gambler gambler) {
        System.out.println("Coin already inserted pull the trigger");
    }

    @Override
    public void pullTrigger(Gambler gambler) {
        System.out.println("Good luck. Wheels are spinning");
        gambler.gamblerState = new StateWinLoose();
    }

    @Override
    public void winLoose(Gambler gambler) {
        System.out.println("pull the trigger ");
    }
}
