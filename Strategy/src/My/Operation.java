package My;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
public class Operation {
    private char type;
    private int a;
    private int b;
    private MathOperation mathOperation;

    public Operation(char type, int a, int b) {
        this.type = type;
        this.a = a;
        this.b = b;
    }

    public char getType() {
        return type;
    }

    public void setMathOperation(MathOperation mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void result(){
        this.mathOperation.calculate(this.a,this.b);
    }
}
