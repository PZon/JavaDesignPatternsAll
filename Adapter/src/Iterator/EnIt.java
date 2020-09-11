package Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created by PZON_SM on 20.07.2020.
 **/
public class EnIt {
    public static void main(String args[]){
        Vector v = new Vector(Arrays.asList(args));
        Iterator iterator = new EnumeratorIterator(v.elements());
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
