package TaskDec;

/**
 * Created by PZON_SM on 13.08.2020.
 **/
public class Rice extends Meal{
    @Override
    public void prepareMeal() {
        System.out.println("I am making Rice meal.");
    }

    /**
     * Created by PZON_SM on 13.08.2020.
     **/
    public static class Chicken extends MealDec {
        public Chicken(Meal meal) {
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
}
