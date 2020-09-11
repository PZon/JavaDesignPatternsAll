package two;

/**
 * Created by PZON_SM on 29.06.2020.
 **/
public class HQFactory {
    public Pizza createPizza(String style, String type) {
        Pizza pizza = null;
        if (style.equals("I")) {
            if (type.equals("veggie")) pizza = new IVeggiePizza();
            else if (type.equals("clam")) pizza = new IClamPizza();
            else if (type.equals("pepperoni")) pizza = new IPepperoniPizza();
            else if (type.equals("seaFruit")) pizza = new ISeaFruitPizza();
        } else if (style.equals("PL")) {
            if (type.equals("veggie")) pizza = new PLVeggiePizza();
            else if (type.equals("clam")) pizza = new PLClamPizza();
            else if (type.equals("pepperoni")) pizza = new PLPepperoniPizza();
            else if (type.equals("seaFruit")) pizza = new PLSeaFruitPizza();
        } else {
            System.out.println("Sorki: nie wiemy jaką pizze chcesz zamówić");
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
