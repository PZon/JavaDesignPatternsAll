package TaskDec;

/**
 * Created by PZON_SM on 13.08.2020.
 **/
public class VeggieDec extends MealDec{
    public VeggieDec(Meal meal) {
        super(meal);
    }

    private void addVeggie(){
        System.out.println("extra Veggies");
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addVeggie();
    }
}
