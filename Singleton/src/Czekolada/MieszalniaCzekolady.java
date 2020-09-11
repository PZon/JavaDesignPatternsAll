package Czekolada;

/**
 * Created by PZON_SM on 06.07.2020.
 **/
public class MieszalniaCzekolady {
    private boolean pusty;
    private boolean zagotowany;
    private static MieszalniaCzekolady unikalnaInstancja;

    public MieszalniaCzekolady() {
        pusty=true;
        zagotowany = false;
    }

    public static MieszalniaCzekolady pobierzInstansje(){
        if(unikalnaInstancja == null){
            System.out.println("tworzę unikalną instancę Mieszalni Czekolady");
            unikalnaInstancja = new MieszalniaCzekolady();
        }
        System.out.println("Zwracam instancję Mieszalni Czekolady");
        return unikalnaInstancja;
    }

    public boolean jestPusty(){return pusty;}
    public boolean jestZagotowany(){return zagotowany;}

    public void nalej(){
        if(jestPusty()){
            pusty = false;
            zagotowany =false;
        }
    }

    public void wylej(){
        if(!jestPusty() && jestZagotowany()){
            pusty = true;
        }
    }

    public void zagotuj(){
        if(!jestPusty() && !jestPusty()){
            zagotowany = true;
        }
    }
}
