package two;

/**
 * Created by PZON_SM on 26.06.2020.
 **/
public abstract class MainPizzaStore {

    abstract Pizza createPizza(String pizzaStyle);

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
            System.out.println("--- Making a " + pizza.getName() + " ---");
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
            return pizza;
    }
}
