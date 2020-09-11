package task;

import java.util.Random;

/**
 * Created by PZON_SM on 31.08.2020.
 **/
public class StateWinLoose implements GamblerState {
    @Override
    public void insertCoin(Gambler gambler) {
        System.out.println("check a prize first");
    }

    @Override
    public void pullTrigger(Gambler gambler) {
        System.out.println("insert coin or check a prize first");
    }

    @Override
    public void winLoose(Gambler gambler) {
        if(checkPrize()==WinLoose.WON) System.out.println("you won take a prize");
        else System.out.println("sorry you lost");
        gambler.gamblerState = new NoCoin();
    }

    private WinLoose checkPrize(){
        WinLoose winLoose;
        int x = new Random().nextInt(10 + 1);
        if((x%5)==0) return WinLoose.WON;
        else return WinLoose.LOST;
    }
}
