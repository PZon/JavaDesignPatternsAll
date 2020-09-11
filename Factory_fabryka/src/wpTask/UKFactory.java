package wpTask;

/**
 * Created by PZON_SM on 11.08.2020.
 **/
public class UKFactory implements MainFactory {
    Swp ukPosition = Swp.RIGHT;

    @Override
    public Car makeToyota(ToyotaType type) {
        switch (type){
            case AVENSSIS:
                return new Toyota("Toyota", "Avenssis", ukPosition);
            case AURIS:
                return new Toyota("Toyota", "Auris", ukPosition);
            default:
                throw new UnsupportedOperationException("Unknown model");
        }
    }

    @Override
    public Car makeNissan(NissanType type) {
        switch (type){
            case XTRAIL:
                return new Nissan("Nissan", "X-Trail", ukPosition);
            case PULSAR:
                return new Nissan("Nissan", "Pulsar", ukPosition);
            default:
                throw new UnsupportedOperationException("Unknown model");
        }
    }
}
