package three;

/**
 * Created by PZON_SM on 02.07.2020.
 **/
public class ItIngrediensFactory implements IngredientFactory {
    @Override
    public Bread createBread() {
        return new ThinBread();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ExtraMozzarelaCheese();
    }

    @Override
    public Veggie[] createVeggie() {
        Veggie veggie[] ={
                new BlackOlives(),
                new GreenOlives(),
                new Papprica(),
        };
        return veggie;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new ExtraPepperoniSlices();
    }

    @Override
    public Clam createClam() {
        return new FrozenClams() ;
    }
}
