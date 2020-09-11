package pzTask;

/**
 * Created by PZON_SM on 11.08.2020.
 **/
public class DemoPizza {
    public static void main(String[] args){
        MainPizzaFactory factory = new PizzaShop();
        Pizza margeritta = factory.createPizza(PizzaType.MARGERITTA);
        Pizza seafood = factory.createPizza(PizzaType.SEAFOOD);
        Pizza pepperoni = factory.createPizza(PizzaType.PEPPERONI);

        System.out.println(margeritta);
        System.out.println(seafood);
        System.out.println(pepperoni);
    }
}
