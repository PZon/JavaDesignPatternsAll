/**
 * Created by PZON_SM on 21.07.2020.
 **/
public class Oswietlenie {
    String opis;

    public Oswietlenie(String opis) {
        this.opis = opis;
    }
    public void wlacz(){
        System.out.println(opis + "wlczony");
    }

    public void wylacz(){
        System.out.println(opis + "wylczony");
    }

    public String przeksztalcTxt(){
        return opis;
    }

    public void przyciemnianie(int poziom){
        System.out.println(opis+" przyciemnienie do poziomu: "+poziom+"%");
    }
}
