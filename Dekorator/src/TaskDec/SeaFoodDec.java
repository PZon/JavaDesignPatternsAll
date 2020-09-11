package TaskDec;

/**
 * Created by PZON_SM on 13.08.2020.
 **/
public class SeaFoodDec extends MealDec {
    public SeaFoodDec(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addSeaFood();
    }

    private void addSeaFood() {
        System.out.println("extra SEA FOOD");
    }
}
