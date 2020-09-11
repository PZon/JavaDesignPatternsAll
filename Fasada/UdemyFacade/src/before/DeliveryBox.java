package before;

/**
 * Created by PZON_SM on 01.09.2020.
 **/
public class DeliveryBox {
    public boolean isFull(){
        System.out.println("the box contain parcel!!!");
        return true;
    }

    public void getUserCode() throws InterruptedException {
        System.out.println("Please enter delivery code");
        Thread.sleep(1500);
        System.out.println("code is valid open box");
    }

    public void openBox(){
        System.out.println("Box is opened");
    }


}
