package StarCafe2;

/**
 * Created by PZON_SM on 24.06.2020.
 **/
public class AddWhisky extends AddOn {
    Drink drink;

    public AddWhisky(Drink drink) {
        this.drink = drink;
        dodatek="Extra Whisky";
    }

    @Override
    public String getOpis() {
        return drink.getOpis();
    }

    @Override
    public double price() {
        return 0.7+drink.price();
    }
}
