package Cars;

/**
 * Created by PZON_SM on 07.09.2020.
 **/
public class Car implements CarIntf {
    private String brand;
    private String model;
    private String carType;
    private String color;
    private double engineSize;
    private String engineType;

    public String getBrand() {
        return brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarType() {
        return carType;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public double getEngineSize() {
        return engineSize;
    }

    @Override
    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public String getEngineType() {
        return engineType;
    }

    @Override
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
