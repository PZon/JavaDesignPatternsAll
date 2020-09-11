package before;

/**
 * Created by PZON_SM on 01.09.2020.
 **/
public class MailBoxDemo {
    public static void main(String[] args) throws InterruptedException {
        collectParcel();

    }

    private static void collectParcel() throws InterruptedException {
        DeliveryBox deliveryBox = new DeliveryBox();
        DelBoxSystem delBoxSystem = new DelBoxSystem();

        deliveryBox.getUserCode();
        if(deliveryBox.isFull() && delBoxSystem.userVerified() && delBoxSystem.isPaymentDone()) deliveryBox.openBox();

    }
}
