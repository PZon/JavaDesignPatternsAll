package pzTask;

/**
 * Created by PZON_SM on 11.08.2020.
 **/
public abstract class Pizza {
    private String name;
    private  double price;
    private boolean veggie;
    private String size;

    public Pizza(String name, double price, boolean veggie, String size) {
        this.name = name;
        this.price = price;
        this.veggie = veggie;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isVeggie() {
        return veggie;
    }

    public void setVeggie(boolean veggie) {
        this.veggie = veggie;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", veggie=" + veggie +
                ", size='" + size + '\'' +
                '}';
    }
}
