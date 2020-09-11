package pzTask;

/**
 * Created by PZON_SM on 11.08.2020.
 **/
public class PizzaShop extends MainPizzaFactory {

    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        switch (pizzaType){
            case MARGERITTA:
                return new Margeritta("Margeritta", 1.1, true, "small");
            case PEPPERONI:
                return new Pepperoni("Pepperoni", 2.1, false, "medium");
            case VEGGIEPIZZA:
                return new Veggiepizza("Veggie", 3.1, true, "large");
            case SEAFOOD:
                return new Seafoodpizza("Seafood pizza", 4.1, false, "extra large");
            default:
                throw new UnsupportedOperationException("No such a Pizza type");
        }
    }
}
