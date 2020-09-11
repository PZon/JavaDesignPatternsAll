package Implementation;

/**
 * Created by PZON_SM on 31.08.2020.
 **/
public class CoffeeMachine {
    CMState cmState;

    public CoffeeMachine() {
        cmState = new NoCoin();
    }

    public void insertCoin(){
        cmState.insertCoin(this);
    }

    public void pushButton(){
        cmState.pushButton(this);
    }

    public void caffeDone(){
        cmState.takeCoffee(this);
    }
    public void returnCoin(){
        cmState.returnCoin(this);
    }
}
