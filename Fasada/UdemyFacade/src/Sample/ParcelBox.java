package Sample;

import before.DelBoxSystem;
import before.DeliveryBox;

/**
 * Created by PZON_SM on 01.09.2020.
 **/
 class ParcelBox {
    public boolean isFull(){
        System.out.println("the box contain parcel!!!");
        return true;
    }

     void getUserCode() throws InterruptedException {
        System.out.println("Please enter delivery code");
        Thread.sleep(1500);
        System.out.println("code is valid open box");
    }

     void openBox(){
        System.out.println("Box is opened");
    }


}
