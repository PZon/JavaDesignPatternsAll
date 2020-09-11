package One;

/**
 * Created by PZON_SM on 25.06.2020.
 **/
public class MainPizzaFactory {
    public  Pizza createPizza(String pizzaType){
        Pizza pizza = null;

        if(pizzaType.equals("cheese")) pizza = new PizzaCheese();
        else if(pizzaType.equals("pepperoni")) pizza = new PizzaPepperoni();
        else if(pizzaType.equals("clam")) pizza = new PizzaClam();
        else if(pizzaType.equals("veggie")) pizza =new PizzaVeggie();

        return pizza;
    }
}
