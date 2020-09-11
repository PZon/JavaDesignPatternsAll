package TaskFacade;


/**
 * Created by PZON_SM on 01.09.2020.
 **/
 class ATMSystem {

     boolean validateTransaction(ATM atm){
         if(atm.verifyPin() && atm.checkBalance()) return true;
         else return false;
     }

     void transactionHistory(ATM atm){
         if(validateTransaction(atm)) System.out.println("last transaction\n money withdraw: 123$");
         else System.out.println("Wrong pin.");
     }

}
