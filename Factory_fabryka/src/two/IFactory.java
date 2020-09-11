package two;

/**
 * Created by PZON_SM on 29.06.2020.
 **/
public class IFactory extends MainPizzaStore {
    Pizza createPizza(String type){
        if(type.equals("Veggie")) return new IVeggiePizza();
        else if(type.equals("Clam")) return new IClamPizza();
        else if(type.equals("Pepperoni")) return new IPepperoniPizza();
        else if(type.equals("Sea fruit")) return new ISeaFruitPizza();
        else return null;
    }
}
