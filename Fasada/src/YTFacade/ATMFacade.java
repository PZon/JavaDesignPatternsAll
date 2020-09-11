package YTFacade;

/**
 * Created by PZON_SM on 08.09.2020.
 **/
public class ATMFacade {
    private int userAccNr;
    private int pin;

    UserAccVerify userAccVerify;
    UserPINVerify userPINVerify;
    AmountVerify amountVerify;
    BankIntro bankIntro;

    public ATMFacade(int userAccNr, int pin) {
        this.userAccNr = userAccNr;
        this.pin = pin;

        bankIntro = new BankIntro();
        userAccVerify = new UserAccVerify();
        userPINVerify = new UserPINVerify();
        amountVerify = new AmountVerify();
    }

    public int getUserAccNr() {
        return userAccNr;
    }

    public int getPin() {
        return pin;
    }

    public void withdrawal(double cash) {
        if (userAccVerify.verifyUserAcc(getUserAccNr()) && userPINVerify.verifyPIN(getPin()) && amountVerify.cashWithdrawal(cash)) {
            System.out.println("Transaction complete");
        } else {
            System.out.println("Transaction failed");
        }
    }

    public void credit(double cash){
        if (userAccVerify.verifyUserAcc(getUserAccNr()) && userPINVerify.verifyPIN(getPin())){
            amountVerify.creditAccount(cash);
            System.out.println("Transaction complete");
        } else {
            System.out.println("Transaction failed");
        }
    }
}
