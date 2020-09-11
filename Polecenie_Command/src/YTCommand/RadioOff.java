package YTCommand;

/**
 * Created by PZON_SM on 09.09.2020.
 **/
public class RadioOff implements Commands {
    Devices devices;

    public RadioOff(Devices devices) {
        this.devices = devices;
    }

    @Override
    public void execute() {
        devices.off();
    }

    @Override
    public void undo() {
        devices.on();
    }
}
