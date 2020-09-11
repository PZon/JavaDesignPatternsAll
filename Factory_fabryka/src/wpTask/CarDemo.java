package wpTask;

/**
 * Created by PZON_SM on 11.08.2020.
 **/
public class CarDemo {
    public static void main(String[] args){
       MainFactory euFactory = new EuropeFactory();
       MainFactory ukFactory = new UKFactory();

       Car nissan = ukFactory.makeNissan(NissanType.XTRAIL);
       System.out.println(nissan.getStearingWheelPos());

       Car toyota = euFactory.makeToyota(ToyotaType.AVENSSIS);
       System.out.println(ToyotaType.AVENSSIS);
    }
}
