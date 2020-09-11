package Sample;

/**
 * Created by PZON_SM on 01.09.2020.
 **/
public class DeliveryFacade {
    private DeliverySystem deliverySystem;
    private ParcelBox parcelBox;

    public DeliveryFacade() {
        parcelBox = new ParcelBox();
        deliverySystem = new DeliverySystem();
    }

    public void pickupParcel() throws InterruptedException {
        parcelBox.getUserCode();
        if(parcelBox.isFull() && deliverySystem.userVerified() && deliverySystem.isPaymentDone()) parcelBox.openBox();
    }
}
