package Cars;

/**
 * Created by PZON_SM on 07.09.2020.
 **/
public class CarEngineer {
    private CarBuilder carBuilder;

    public CarEngineer(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void makeCar(){
        carBuilder.buildBrand();
        carBuilder.buildModel();
        carBuilder.buildCarType();
        carBuilder.buildColor();
        carBuilder.buildEngineType();
        carBuilder.buildEngineSize();
    }

    public Car getCar(){
        return this.carBuilder.getCar();
    }
}
