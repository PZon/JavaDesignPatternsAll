package SndAproach;


/**
 * Created by PZON_SM on 12.08.2020.
 **/
public class Demo {
    public static void main(String[] args){
        EuTv euTv = new EuTv();
        UkTv ukTv = new UkTv();

        EuDev euDev = new EuDev() {
            @Override
            public void euPowOn() {
                System.out.println("European dev is working");
            }
        };

        UkDev ukDev = new UkDev() {
            @Override
            public void ukPowOn() {
                System.out.println("uk dev is working");
            }
        };

        UkToEuAdptr euAdapter=new UkToEuAdptr(ukDev);
        euTv.switchOn(euAdapter);
    }
}
