package One;

/**
 * Created by PZON_SM on 25.06.2020.
 **/
public class StorePizza {
    MainPizzaFactory pizzaFactory;

    public StorePizza(MainPizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String pizzaType){
        Pizza pizza;

        pizza = pizzaFactory.createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
