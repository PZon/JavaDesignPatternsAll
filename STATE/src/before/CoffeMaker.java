package before;

/**
 * Created by PZON_SM on 31.08.2020.
 **/
public class CoffeMaker {
    State state;

    public CoffeMaker() {
        state = State.NOCOIN;
    }

    public void insertCoin(){
        switch (state){
            case NOCOIN:
                System.out.println("coin inserted");
                state=State.COININSERTED;
                break;
            case COININSERTED:
                System.out.println("coin already inserted");
                break;
            case CUPFULL:
                System.out.println("caffe ready - take a cup");
                break;
        }
    }

    public void pushButton(){
        switch (state){
            case NOCOIN:
                System.out.println("no coin");
                break;
            case COININSERTED:
                System.out.println("Making caffe");
                state = State.CUPFULL;
            case CUPFULL:
                System.out.println("Take your caffe is ready");
        }
    }

    public void caffeReady(){
        switch (state){
            case NOCOIN:
                System.out.println("no coin");
                break;
            case COININSERTED:
                System.out.println("press a button");
                break;
            case CUPFULL:
                System.out.println("caffe taken");
                state = State.NOCOIN;
                break;
        }
    }

    public void returnCoin(){
        switch (state){
            case NOCOIN:
                System.out.println("no coin inserted");
                break;
            case COININSERTED:
                System.out.println("tak your coin");
                state = State.NOCOIN;
                break;
            case CUPFULL:
                System.out.println("to late - caffe done");
                break;
        }
    }

}
