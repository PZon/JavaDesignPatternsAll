package two;

/**
 * Created by PZON_SM on 29.06.2020.
 **/
public class PlFactory extends MainPizzaStore {
    Pizza createPizza(String type){
        if(type.equals("Veggie")) return new PLVeggiePizza();
        else if(type.equals("Clam")) return new PLClamPizza();
        else if(type.equals("Pepperoni")) return new PLPepperoniPizza();
        else if(type.equals("Sea fruit")) return new PLSeaFruitPizza();
        else return null;
    }
}
