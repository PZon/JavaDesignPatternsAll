package My;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
public class Minus implements MathOperation {
    @Override
    public void calculate(int a, int b) {
        System.out.println("difference of "+a+" & "+b+" equals "+(a-b));
    }
}
