package YTFacadeBefore;

/**
 * Created by PZON_SM on 09.09.2020.
 **/
public class Pin {
    private int pin = 1234;

    public int getPin() {
        return pin;
    }

    public boolean verifyPIN(int userPin){
        if(userPin == getPin()) return true;
        else return false;
    }
}
