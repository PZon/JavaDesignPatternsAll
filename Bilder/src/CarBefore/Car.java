package CarBefore;

/**
 * Created by PZON_SM on 07.09.2020.
 **/
public class Car {
    private String brand;
    private String model;
    private String carType;
    private String color;
    private double engineSize;
    private String engineType;

    public Car(String brand, String model, String carType, String color, double engineSize, String engineType) {
        this.brand = brand;
        this.model = model;
        this.carType = carType;
        this.color = color;
        this.engineSize = engineSize;
        this.engineType = engineType;
    }

    public Car(String brand, String model, String carType) {
        this.brand = brand;
        this.model = model;
        this.carType = carType;
    }

    public Car(String brand, String model, String carType, String color, double engineSize) {
        this.brand = brand;
        this.model = model;
        this.carType = carType;
        this.color = color;
        this.engineSize = engineSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
