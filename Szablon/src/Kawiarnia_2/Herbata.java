package Kawiarnia_2;

/**
 * Created by PZON_SM on 22.07.2020.
 **/
public class Herbata extends PrzepisNaNapoj {
    @Override
    void zaparzNapoj() {
        System.out.println("Parze herbate");
    }

    @Override
    void dodatki() {
        System.out.println("Plasterek cytryny");
    }
}
