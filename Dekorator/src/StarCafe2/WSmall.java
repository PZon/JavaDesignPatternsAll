package StarCafe2;

/**
 * Created by PZON_SM on 24.06.2020.
 **/
public class WSmall extends Wielkosc {
    AddOn addOn;

    public WSmall(AddOn addOn) {
        this.addOn = addOn;
    }

    @Override
    public double price() {
        return addOn.price()*0.75;
    }

    @Override
    public String getAddOn() {
        return addOn.getAddOn();
    }

    @Override
    public String getOpis() {
        return addOn.getOpis();
    }
}
