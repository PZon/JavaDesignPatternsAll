package TaskDec;

/**
 * Created by PZON_SM on 13.08.2020.
 **/
public class ChickenDec extends MealDec {
    public ChickenDec(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addChicken();
    }

    private void addChicken() {
        System.out.println("extra Chicken");
    }
}
