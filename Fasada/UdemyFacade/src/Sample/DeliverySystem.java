package Sample;

/**
 * Created by PZON_SM on 01.09.2020.
 **/
 class DeliverySystem {
     void sendMessage(){
        System.out.println("confirmation email has been sent");
    }

     boolean isPaymentDone(){
        System.out.println("Payment is confirmed");
        return true;
    }

     boolean userVerified(){
        System.out.println("User verified");
        return true;
    }
}
