package YTCommand;

/**
 * Created by PZON_SM on 09.09.2020.
 **/
public class TvOn implements Commands {
    Devices device;

    public TvOn(Devices device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }

    @Override
    public void undo() {
        device.off();
    }
}
