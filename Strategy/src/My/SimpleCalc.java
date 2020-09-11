package My;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
public class SimpleCalc {
    public static void main(String[] args) {

    Operation operation = new Operation('%',20,3);

    if(operation.getType()=='+'){
        operation.setMathOperation(new Add());
        operation.result();
    }else if(operation.getType()=='-'){
        operation.setMathOperation(new Minus());
        operation.result();
    }else if(operation.getType()=='*'){
        operation.setMathOperation(new Times());
        operation.result();
    }else if(operation.getType()=='/'){
        operation.setMathOperation(new Divide());
        operation.result();
    }else{
        System.out.println("wrong operation!!!");
    }
}
}
