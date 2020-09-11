package TaskFacade;

/**
 * Created by PZON_SM on 01.09.2020.
 **/
public class ATMFacade {
    private ATM atm;
    private ATMSystem atmSystem;

    public ATMFacade() {
        atm = new ATM(1234);
        atmSystem = new ATMSystem();
    }

    public void cashMachine(){
       if(atmSystem.validateTransaction(atm)) atm.withdrawMoney();
       atm.checkBalance();
       atmSystem.transactionHistory(atm);
    }
}
