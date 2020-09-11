package YTCommand;

/**
 * Created by PZON_SM on 09.09.2020.
 **/
public class RadioUp implements Commands {
    Devices devices;

    public RadioUp(Devices devices) {
        this.devices = devices;
    }

    @Override
    public void execute() {
        devices.up();
    }

    @Override
    public void undo() {
        devices.down();
    }
}
