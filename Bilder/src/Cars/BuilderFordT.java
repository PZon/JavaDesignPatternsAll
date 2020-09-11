package Cars;

/**
 * Created by PZON_SM on 07.09.2020.
 **/
public class BuilderFordT implements CarBuilder {
    private Car car;

    public BuilderFordT() {
        this.car = new Car();
    }

    @Override
    public void buildBrand() {
        car.setBrand("Ford");
    }

    @Override
    public void buildModel() {
        car.setModel("T");
    }

    @Override
    public void buildCarType() {
        car.setCarType("old Mobil");
    }

    @Override
    public void buildColor() {
        car.setColor("Black");
    }

    @Override
    public void buildEngineSize() {
        car.setEngineType("petrol");
    }

    @Override
    public void buildEngineType() {
        car.setEngineSize(0.0);
    }

    @Override
    public Car getCar() {
        return car;
    }
}
