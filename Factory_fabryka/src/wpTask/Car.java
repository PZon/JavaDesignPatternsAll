package wpTask;

/**
 * Created by PZON_SM on 11.08.2020.
 **/
public abstract class Car {
    private String model;
    private String type;
    private  Swp stearingWheelPos;

    public Car(String model, String type, Swp stearingWheelPos) {
        this.model = model;
        this.type = type;
        this.stearingWheelPos = stearingWheelPos;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Swp getStearingWheelPos() {
        return stearingWheelPos;
    }

}
