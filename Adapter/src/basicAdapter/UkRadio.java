package basicAdapter;

/**
 * Created by PZON_SM on 12.08.2020.
 **/
public class UkRadio implements UkDevice {
    @Override
    public void powerOn() {
        System.out.println("It is BBC radio");
    }
}
