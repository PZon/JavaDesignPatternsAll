package three;

/**
 * Created by PZON_SM on 03.07.2020.
 **/
public class CheesePizza extends Pizza{
    IngredientFactory ingredientFactory;

    public CheesePizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing" + name);
        bread = ingredientFactory.createBread();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
