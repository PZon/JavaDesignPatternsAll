package wpTask;

/**
 * Created by PZON_SM on 11.08.2020.
 **/
public interface MainFactory {
    Car makeToyota(ToyotaType type);
    Car makeNissan(NissanType type);
}
