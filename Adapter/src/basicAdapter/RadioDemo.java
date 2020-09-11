package basicAdapter;

/**
 * Created by PZON_SM on 12.08.2020.
 **/
public class RadioDemo {
    public static void main(String[] args){
        //UkRadio ukRadio = new UkRadio();
       // EuDevice ukRadioEu = new UkToEuAdapter(ukRadio);
        EuDevice ukRadioEu = new UkToEuAdapter(new UkRadio());
        UkDevice euRadioUk = new EuToUkDeviceAdapter(new EuRadio());
        EuDevice usRadioEU = new UsToEuAdapter(new USRadio());

        ukRadioEu.powerOn();
        euRadioUk.powerOn();
        usRadioEU.powerOn();

        System.out.println("=== Two way adapter  ===");
        UkRadio ukRadio = new UkRadio();
        USRadio usRadio = new USRadio();
        EuRadio euRadio = new EuRadio();
        TwoWayAdapter adapter = new TwoWayAdapter(usRadio,ukRadio,euRadio);
        adapter.powerOn();


    }
}
