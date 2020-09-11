package YTFacadeBefore;

/**
 * Created by PZON_SM on 09.09.2020.
 **/
public class ATMTest {
    public static void main(String[] args){
        System.out.println("Welcome into Y/OUR Bank");
        useAtm();
    }

    private static void useAtm() {
        UserAcc userAcc = new UserAcc();
        Pin pin = new Pin();
        Amount amount = new Amount();


        if(userAcc.verifyUserAcc(12344321) && pin.verifyPIN(1234)){
            amount.cashWithdrawal(100);
            amount.creditAccount(2000);
            amount.cashWithdrawal(1300);
        }else{
            System.out.println("Incorrect Acc nr or Pin nr");
        }

    }
}
