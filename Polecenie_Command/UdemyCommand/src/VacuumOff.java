/**
 * Created by PZON_SM on 27.08.2020.
 **/
public class VacuumOff implements Command {
    private VacuumCleaner vacuumCleaner;

    public VacuumOff(VacuumCleaner vacuumCleaner) {
        this.vacuumCleaner = vacuumCleaner;
    }

    @Override
    public void run() {
        vacuumCleaner.switchOff();
    }

    @Override
    public void prev() {
        vacuumCleaner.switchOn();
    }
}
