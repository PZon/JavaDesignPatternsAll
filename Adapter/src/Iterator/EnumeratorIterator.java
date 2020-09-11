package Iterator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by PZON_SM on 20.07.2020.
 **/
public class EnumeratorIterator implements Iterator {
    Enumeration enumeration;

    public EnumeratorIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    public boolean hasNext(){
        return enumeration.hasMoreElements();
    }

    public Object next(){
        return enumeration.nextElement();
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }
}
