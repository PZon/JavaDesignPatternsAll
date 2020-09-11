package YTCommand;

/**
 * Created by PZON_SM on 09.09.2020.
 **/
public class RadioDown implements Commands{
    Devices devices;

    public RadioDown(Devices devices) {
        this.devices = devices;
    }

    @Override
    public void execute() {
        devices.down();
    }

    @Override
    public void undo() {
        devices.up();
    }
}
