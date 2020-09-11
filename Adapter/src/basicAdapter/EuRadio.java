package basicAdapter;

/**
 * Created by PZON_SM on 12.08.2020.
 **/
public class EuRadio implements EuDevice {
    @Override
    public void powerOn() {
        System.out.println("It is Euro news");
    }
}
