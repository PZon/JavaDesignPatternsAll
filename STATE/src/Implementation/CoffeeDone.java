package Implementation;

/**
 * Created by PZON_SM on 31.08.2020.
 **/
public class CoffeeDone implements CMState {
    @Override
    public void insertCoin(CoffeeMachine coffeeMachine) {
        System.out.println("remove coffee first");
    }

    @Override
    public void pushButton(CoffeeMachine coffeeMachine) {
        System.out.println("remove coffee first");
    }

    @Override
    public void takeCoffee(CoffeeMachine coffeeMachine) {
        System.out.println("Coffee Done");
        coffeeMachine.cmState = new NoCoin();
    }

    @Override
    public void returnCoin(CoffeeMachine coffeeMachine) {
        System.out.println("coffee done to late");
    }
}
