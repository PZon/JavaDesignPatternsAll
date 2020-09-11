package Kawiarnia_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by PZON_SM on 22.07.2020.
 **/
public class HerbataExtras extends PrzepisNaNapojZDodtakami {
    @Override
    void zaparzNapoj() {
        System.out.println("Parze herbate");
    }

    @Override
    void dodatki() {
        System.out.println("Extra plaster cytryny");
    }

    public boolean zamowionoDodatki(){
        String odpowiedz = pobierzOdpowiedz();

        if(odpowiedz.toLowerCase().startsWith("t")) return true;
        else return false;
    }

    private String pobierzOdpowiedz(){
        String odpowiedz = null;

        System.out.println("jakies dodatki (t/n)?");

        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        try{
            odpowiedz = in.readLine();
        }catch (IOException ioe){
            System.err.println("Bledna odpowiedz !!!");
        }

        if(odpowiedz== null) return "nie";

        return odpowiedz;
    }
}
