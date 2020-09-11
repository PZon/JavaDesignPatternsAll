package Implementation;


/**
 * Created by PZON_SM on 31.08.2020.
 **/
public class CMDemo {
    public static void main(String[] args){
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.insertCoin();
        coffeeMachine.pushButton();
        coffeeMachine.caffeDone();
        coffeeMachine.returnCoin();

    }
}
