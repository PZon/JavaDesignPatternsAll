package Kawiarnia_1;

/**
 * Created by PZON_SM on 21.07.2020.
 **/
public class Kawa {
    void przygotowanieKawy(int lyzeczki){
        zagotujWode();
        wsypKawe();
        zalejWrzatkiem();
        dodajCukier(lyzeczki);
    }

    public void zagotujWode(){
        System.out.println("Gotuje wode");
    }

    public void wsypKawe(){
        System.out.println("Zasypuje kawe");
    }
    public void zalejWrzatkiem(){
        System.out.println("Zalewam wrzatkiem");
    }
    public void dodajCukier(int lyzeczki){
        if(lyzeczki==0) System.out.println("Nie slodze");
        else System.out.println("Poprosze o "+lyzeczki+" lyzeczke cukru");
    }
}
