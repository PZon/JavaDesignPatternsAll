package Cars;

/**
 * Created by PZON_SM on 07.09.2020.
 **/
public class BuildFordMustang implements CarBuilder {
    private Car car;

    public BuildFordMustang() {
        this.car = new Car();
    }

    @Override
    public void buildBrand() {
        car.setBrand("Ford");
    }

    @Override
    public void buildModel() {
        car.setModel("Mustang");
    }

    @Override
    public void buildCarType() {
        car.setColor("Sport car");
    }

    @Override
    public void buildColor() {
        car.setCarType("Red");
    }

    @Override
    public void buildEngineSize() {
        car.setEngineSize(4.0);
    }

    @Override
    public void buildEngineType() {
        car.setEngineType("petrol");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
