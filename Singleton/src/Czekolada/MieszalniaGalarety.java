package Czekolada;

/**
 * Created by PZON_SM on 08.07.2020.
 **/
public class MieszalniaGalarety {
    private boolean pusty;
    private boolean zagotowany;
    private volatile static MieszalniaGalarety unikalnaInstancja;

    public MieszalniaGalarety() {
        pusty=true;
        zagotowany = false;
    }

    public static MieszalniaGalarety pobierzInstansje(){
        if(unikalnaInstancja == null){
            synchronized (MieszalniaGalarety.class) {
                if(unikalnaInstancja==null){
                    System.out.println("tworzę unikalną instancę Mieszalni galarety");
                    unikalnaInstancja=new MieszalniaGalarety();
                }
            }
            }
        System.out.println("Zwracam instancję Mieszalni galarety");
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
