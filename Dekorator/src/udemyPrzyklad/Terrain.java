package udemyPrzyklad;

/**
 * Created by PZON_SM on 13.08.2020.
 **/
public abstract class Terrain {
    private String description;
    private int fuelCost;

    public Terrain(String description, int fuelCost) {
        this.description = description;
        this.fuelCost = fuelCost;
    }

    public String getDescription() {
        return description;
    }

    public int getFuelCost() {
        return fuelCost;
    }
}
