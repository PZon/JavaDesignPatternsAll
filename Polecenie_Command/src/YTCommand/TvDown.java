package YTCommand;

/**
 * Created by PZON_SM on 09.09.2020.
 **/
public class TvDown implements Commands {
    Devices device;

    public TvDown(Devices device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.down();
    }

    @Override
    public void undo() {
        device.up();
    }
}
