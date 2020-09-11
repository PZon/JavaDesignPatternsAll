package Kawiarnia_2;

/**
 * Created by PZON_SM on 22.07.2020.
 **/
public class Kawa extends PrzepisNaNapoj{
    @Override
    void zaparzNapoj() {
        System.out.println("Parze Kawe");
    }

    @Override
    void dodatki() {
        System.out.println("łyżeczka cukru");
    }
}
