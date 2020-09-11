package StarCafe2;

/**
 * Created by PZON_SM on 24.06.2020.
 **/
public class WLarge extends Wielkosc {
    AddOn addOn;

    public WLarge(AddOn addOn) {
        this.addOn = addOn;
    }


    @Override
    public String getOpis() {
        return addOn.getOpis();
    }

    @Override
    public double price() {
        return addOn.price()*1.25;
    }

    @Override
    public String getAddOn() {
        return addOn.getAddOn();
    }
}
