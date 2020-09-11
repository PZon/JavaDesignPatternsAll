package Tutorial;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PZON_SM on 12.08.2020.
 **/
public class Demo {
    public static void main(String[] args){

        List<Object> unitList = new ArrayList<>();
        for(int i=0; i<10; i++){
            unitList.add(new Tank(1,1));
            unitList.add(new Ship(2,2));
            unitList.add(new GunMan(3,3));
        }

        for(int i=0; i<10; i++){
            System.out.println(i+"/ "+unitList);
        }
    }
}
