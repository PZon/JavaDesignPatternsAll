package Implementation;

/**
 * Created by PZON_SM on 31.08.2020.
 **/
public class NoCoin implements CMState {
    @Override
    public void insertCoin(CoffeeMachine coffeeMachine) {
        System.out.println("coin inserted - choose a button");
        coffeeMachine.cmState = new CoinInserted();
    }

    @Override
    public void pushButton(CoffeeMachine coffeeMachine) {
        System.out.println("insert coin first");
    }

    @Override
    public void takeCoffee(CoffeeMachine coffeeMachine) {
        System.out.println("insert coin first");

    }

    @Override
    public void returnCoin(CoffeeMachine coffeeMachine) {
        System.out.println("insert coin first");
    }
}
