package TaskFacade;

/**
 * Created by PZON_SM on 01.09.2020.
 **/
 class ATM {
     int userPin;
     int pin;

    public ATM(int userPin) {
        this.userPin = userPin;
        this.pin = 1234;
    }

    boolean verifyPin(){
      if(this.userPin == this.pin){
          System.out.println("Pin verified. You can check your balance or withdraw a money");
          return true;
      }else {
          System.out.println("sorry wrong pin. try again");
          return false;
      }
  }

  boolean checkBalance(){
      System.out.println("Your balance is 1234.");
      return true;
  }

  void withdrawMoney(){
      System.out.println("take your money !!!!");
  }
}
