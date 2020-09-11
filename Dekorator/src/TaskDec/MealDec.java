package TaskDec;

/**
 * Created by PZON_SM on 13.08.2020.
 **/
public abstract class MealDec extends Meal {
    protected Meal meal;

    public MealDec(Meal meal) {
        this.meal = meal;
    }

    @Override
    public void prepareMeal() {
        this.meal.prepareMeal();
    }
}
