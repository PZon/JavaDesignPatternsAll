package YTCommand;

/**
 * Created by PZON_SM on 09.09.2020.
 **/
public class TvOff implements Commands {
    Devices device;

    public TvOff(Devices device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }

    @Override
    public void undo() {
        device.on();
    }
}
