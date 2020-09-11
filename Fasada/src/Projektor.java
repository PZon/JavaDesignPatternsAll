/**
 * Created by PZON_SM on 21.07.2020.
 **/
public class Projektor {
    String opis;

    public Projektor(String opis) {
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
}
