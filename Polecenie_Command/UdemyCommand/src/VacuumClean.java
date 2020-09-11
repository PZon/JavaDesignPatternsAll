/**
 * Created by PZON_SM on 27.08.2020.
 **/
public class VacuumClean implements Command {
    private VacuumCleaner vacuumCleaner;

    public VacuumClean(VacuumCleaner vacuumCleaner) {
        this.vacuumCleaner = vacuumCleaner;
    }

    @Override
    public void run() {
        vacuumCleaner.clean();
    }

    @Override
    public void prev() {
        vacuumCleaner.charging();
    }
}
