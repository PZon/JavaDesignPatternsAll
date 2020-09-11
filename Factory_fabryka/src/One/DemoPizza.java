package One;

/**
 * Created by PZON_SM on 25.06.2020.
 **/
public class DemoPizza {
    public static void main(String[] args) {

        MainPizzaFactory factory = new MainPizzaFactory();
        StorePizza storePizza = new StorePizza(factory);

        Pizza pizza = storePizza.orderPizza("clam");
        System.out.println("We ordered a " + pizza.getName() + "\n");

        pizza = storePizza.orderPizza("pepperoni");
        System.out.println("We ordered a " + pizza.getName() + "\n");

        pizza = storePizza.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName() + "\n");

        pizza = storePizza.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");
    }
}
