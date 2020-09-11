package three;

/**
 * Created by PZON_SM on 03.07.2020.
 **/
public class PizzeriaDemo {
    public static void main(String[] args){
        PizzaStore plSklep = new PlPizzaStore();
        PizzaStore itShop = new ItPizzaStore();

        Pizza pizza = plSklep.orderPizza("pepperoni");
        System.out.println("Została zamówiona pizza "+ pizza +"\n");

        pizza=itShop.orderPizza("veggie");
        System.out.println(" has been ordered"+pizza+"\n");
    }
}
