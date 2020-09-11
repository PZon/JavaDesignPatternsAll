package three;

/**
 * Created by PZON_SM on 02.07.2020.
 **/
public class PlIngredientsFactory implements IngredientFactory {
    @Override
    public Bread createBread() {
        return new GrubeCiasto();
    }

    @Override
    public Sauce createSauce() {
        return new Ketchup();
    }

    @Override
    public Cheese createCheese() {
        return new DodatkowySer();
    }

    @Override
    public Veggie[] createVeggie() {
        Veggie veggies[]={new Czosnek(), new Oliwki(), new PaprykaChilli()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new ExtraSalami();
    }

    @Override
    public Clam createClam() {
        return new ExtraKrewetki();
    }
}
