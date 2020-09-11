package YTCommand;

/**
 * Created by PZON_SM on 09.09.2020.
 **/
public class RadioOn implements Commands {
    Devices devices;

    public RadioOn(Devices devices) {
        this.devices = devices;
    }

    @Override
    public void execute() {
        devices.on();
    }

    @Override
    public void undo() {
        devices.off();
    }
}
