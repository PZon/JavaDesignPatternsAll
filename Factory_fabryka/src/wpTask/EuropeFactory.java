package wpTask;

/**
 * Created by PZON_SM on 11.08.2020.
 **/
public class EuropeFactory implements MainFactory {

    Swp stearingWheelPos = Swp.LEFT;

    @Override
    public Car makeToyota(ToyotaType type) {
        switch (type){
            case AURIS:
                return new Toyota("Toyota", "Auris", stearingWheelPos);
            case AVENSSIS:
                return new Toyota("Toyota", "Avenssis", stearingWheelPos);
            default:
                throw new UnsupportedOperationException("Unknown Model");
        }
    }

    @Override
    public Nissan makeNissan(NissanType type) {
        switch (type){
            case PULSAR:
                return new Nissan("Nissan", "Pulsar", stearingWheelPos);
            case XTRAIL:
                return new Nissan("Nissan", "X-Trail", stearingWheelPos);
            default:
                throw new UnsupportedOperationException("Unknown model");
        }
    }
}
