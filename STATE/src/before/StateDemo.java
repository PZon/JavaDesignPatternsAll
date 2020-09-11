package before;

/**
 * Created by PZON_SM on 31.08.2020.
 **/
public class StateDemo {
    static public void main(String[] args){
        CoffeMaker caffe = new CoffeMaker();

        caffe.insertCoin();
        caffe.pushButton();
        caffe.caffeReady();
        caffe.returnCoin();
    }
}
