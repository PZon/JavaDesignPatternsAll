package YTCommandBefore;

/**
 * Created by PZON_SM on 09.09.2020.
 **/
public class Tester {
    public static void main(String[] args){
        TvManager tv = new TvManager(new Tv());
        RadioManager radio = new RadioManager(new Radio());
        tv.execute();
        radio.execute();
    }
}
