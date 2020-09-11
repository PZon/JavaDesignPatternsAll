package YTCommand;

/**
 * Created by PZON_SM on 09.09.2020.
 **/
public class TvUp implements Commands {
    Devices device;

    public TvUp(Devices device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.up();
    }

    @Override
    public void undo() {
        device.down();
    }
}
