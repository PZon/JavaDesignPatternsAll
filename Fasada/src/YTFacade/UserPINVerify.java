package YTFacade;

/**
 * Created by PZON_SM on 08.09.2020.
 **/
public class UserPINVerify {
    private int pin = 1234;

    public int getPin() {
        return pin;
    }

    public boolean verifyPIN(int userPin){
        if(userPin == getPin()) return true;
        else return false;
    }
}
