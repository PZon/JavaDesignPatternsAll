package Implementation;

/**
 * Created by PZON_SM on 31.08.2020.
 **/
public interface CMState {
    void insertCoin(CoffeeMachine coffeeMachine);
    void pushButton(CoffeeMachine coffeeMachine);
    void takeCoffee(CoffeeMachine coffeeMachine);
    void returnCoin(CoffeeMachine coffeeMachine);
}
