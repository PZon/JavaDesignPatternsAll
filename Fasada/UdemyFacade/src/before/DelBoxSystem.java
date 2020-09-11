package before;

/**
 * Created by PZON_SM on 01.09.2020.
 **/
public class DelBoxSystem {
    public void sendMessage(){
        System.out.println("confirmation email has been sent");
    }

    public boolean isPaymentDone(){
        System.out.println("Payment is confirmed");
        return true;
    }

    public boolean userVerified(){
        System.out.println("User verified");
        return true;
    }
}
