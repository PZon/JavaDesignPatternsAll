package Cars;

/**
 * Created by PZON_SM on 07.09.2020.
 **/
public interface CarBuilder {
    void buildBrand();
    void buildModel();
    void buildCarType();
    void buildColor();
    void buildEngineSize();
    void buildEngineType();

    Car getCar();
}
