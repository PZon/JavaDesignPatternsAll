package YTCommandBefore;

/**
 * Created by PZON_SM on 09.09.2020.
 **/
public class TvManager {
    private Tv tv;

    public TvManager(Tv tv) {
        this.tv = tv;
    }

    public void execute(){
        tv.on();
        tv.up();
        tv.down();
        tv.off();
    }
}
