package YTFacade;

/**
 * Created by PZON_SM on 08.09.2020.
 **/
public class AmountVerify {
    private double amount=1000.00;

    public double getAmount() {
        return amount;
    }

    public void increaseAmount(double credit){
        this.amount += credit;
    }

    public void decreaseAmount(double debit){
        this.amount -= debit;
    }

    public boolean cashWithdrawal(double cash){
        if(getAmount()< cash){
            System.out.println("Error: You have not enough money on your account");
            System.out.println("Current balance: "+getAmount());
            return false;
        } else{
            decreaseAmount(cash);
            System.out.println("Cash withdrawal complete. Your balance is: "+getAmount());
            return true;
        }
    }

    public void creditAccount(double cash){
        increaseAmount(cash);
        System.out.println("Deposit complete. Your new balance is: "+getAmount());
    }
}
