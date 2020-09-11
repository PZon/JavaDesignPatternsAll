/**
 * Created by PZON_SM on 27.08.2020.
 **/
public class VacuumCharging implements Command{
    private VacuumCleaner vacuumCleaner;

    public VacuumCharging(VacuumCleaner vacuumCleaner) {
        this.vacuumCleaner = vacuumCleaner;
    }

    @Override
    public void run() {
        vacuumCleaner.charging();
    }

    @Override
    public void prev() {
        vacuumCleaner.clean();
    }
}
