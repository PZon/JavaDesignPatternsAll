package Kawiarnia_2;

/**
 * Created by PZON_SM on 22.07.2020.
 **/
public abstract class PrzepisNaNapojZDodtakami {
    final void przygotujNapoj(){
        zagotujWode();
        zaparzNapoj();
        przelejDoFilizanki();
        if(zamowionoDodatki()) dodatki();
    }

    boolean zamowionoDodatki(){return  true;}
    abstract void zaparzNapoj();
    abstract void dodatki();
    void zagotujWode(){
        System.out.println("Gotuje wode na napój;");
    }
    void przelejDoFilizanki(){
        System.out.println("Przelewam napój do filiżanki");
    }
}
