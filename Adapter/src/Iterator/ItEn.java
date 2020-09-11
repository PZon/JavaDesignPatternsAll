package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

/**
 * Created by PZON_SM on 20.07.2020.
 **/
public class ItEn {
    public static void main (String args[]) {
        ArrayList l = new ArrayList(Arrays.asList(args));
        Enumeration enumeration = new IteratorEnumerator(l.iterator());
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
