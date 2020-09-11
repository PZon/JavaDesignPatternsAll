package YTFacadeBefore;

/**
 * Created by PZON_SM on 09.09.2020.
 **/
public class UserAcc {
    private int accNr = 12344321;

    public int getAccNr() {
        return accNr;
    }

    public boolean verifyUserAcc(int userAccNr){
        if(userAccNr == getAccNr()) return true;
        else return false;
    }
}
