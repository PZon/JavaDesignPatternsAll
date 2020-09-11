package TaskDec;

/**
 * Created by PZON_SM on 13.08.2020.
 **/
public class MealDemo {
    public static void main(String[] args){
        Meal meal = new Potato();
        meal=new VeggieDec(new SeaFoodDec(new ChickenDec(meal)));

        meal.prepareMeal();

    }
}
