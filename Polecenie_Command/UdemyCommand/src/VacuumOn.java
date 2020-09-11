/**
 * Created by PZON_SM on 27.08.2020.
 **/
public class VacuumOn implements Command{
    private  VacuumCleaner vacuumCleaner;

    public VacuumOn(VacuumCleaner vacuumCleaner) {
        this.vacuumCleaner = vacuumCleaner;
    }

    @Override
    public void run() {
        vacuumCleaner.switchOn();
    }

    @Override
    public void prev() {
        vacuumCleaner.switchOff();
    }
}
