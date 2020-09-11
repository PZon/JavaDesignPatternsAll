package Implementation;

/**
 * Created by PZON_SM on 31.08.2020.
 **/
public class CoinInserted implements CMState {
    @Override
    public void insertCoin(CoffeeMachine coffeeMachine) {
        System.out.println("coin already inserted");
    }

    @Override
    public void pushButton(CoffeeMachine coffeeMachine) {
        System.out.println("Making coffee in progress");
        coffeeMachine.cmState = new CoffeeDone();
    }

    @Override
    public void takeCoffee(CoffeeMachine coffeeMachine) {
        System.out.println("choose option - press button");

    }

    @Override
    public void returnCoin(CoffeeMachine coffeeMachine) {
        System.out.println("take a coin");
        coffeeMachine.cmState = new NoCoin();
    }
}
