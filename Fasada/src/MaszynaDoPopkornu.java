/**
 * Created by PZON_SM on 20.07.2020.
 **/
public class MaszynaDoPopkornu {
    String opis;

    public MaszynaDoPopkornu(String opis) {
        this.opis = opis;
    }

    public void wlacz(){
        System.out.println(opis + "wlczony");
    }

    public void wylacz(){
        System.out.println(opis + "wylczony");
    }

    public void robiSie(){
        System.out.println(opis + "robi się");
    }

    public String przeksztalcTxt(){
        return opis;
    }
}
