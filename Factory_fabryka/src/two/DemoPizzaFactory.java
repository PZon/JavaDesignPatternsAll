package two;

/**
 * Created by PZON_SM on 29.06.2020.
 **/
public class DemoPizzaFactory {

    public static void main(String[] args){
        MainPizzaStore itStore = new IFactory();
        MainPizzaStore plStore = new PlFactory();

        Pizza pizza =itStore.orderPizza("Pepperoni");
        System.out.println(pizza.getName()+" has been ordered."+"\n");

        pizza = plStore.orderPizza("Sea fruit");
        System.out.println(pizza.getName()+" has been ordered."+"\n");


    }
}
