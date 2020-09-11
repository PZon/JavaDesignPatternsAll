package Kawiarnia_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by PZON_SM on 22.07.2020.
 **/
public class KawaExtras extends PrzepisNaNapojZDodtakami {
    @Override
    void zaparzNapoj() {
        System.out.println("Parze kawe");
    }

    @Override
    void dodatki() {
        System.out.println("Słodze 1 łyzeczke");
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
