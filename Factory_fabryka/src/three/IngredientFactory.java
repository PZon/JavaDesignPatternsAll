package three;

/**
 * Created by PZON_SM on 02.07.2020.
 **/
public interface IngredientFactory {
    public Bread createBread();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggie[] createVeggie();
    public Pepperoni createPepperoni();
    public Clam createClam();
}
