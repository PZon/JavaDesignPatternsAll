package Iterator;

import java.util.Enumeration;
import java.util.Iterator;
/**
 * Created by PZON_SM on 20.07.2020.
 **/
public class IteratorEnumerator implements Enumeration {
    Iterator iterator;

    public IteratorEnumerator(Iterator iterator) {
        this.iterator = iterator;
    }

    public boolean hasMoreElements(){
        return iterator.hasNext();
    }

    public Object nextElement(){
        return iterator.next();
    }
}
