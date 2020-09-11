package task;

/**
 * Created by PZON_SM on 31.08.2020.
 **/
public interface GamblerState {
     void insertCoin(Gambler gambler);
     void pullTrigger(Gambler gambler);
     void winLoose(Gambler gambler);

}
