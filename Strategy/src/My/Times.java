package My;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
public class Times implements MathOperation {
    @Override
    public void calculate(int a, int b) {
        System.out.println("Product of "+a+" & "+b+" equals "+(a*b));
    }
}
