/**
 * Created by PZON_SM on 21.07.2020.
 **/
public class Ekran {
    String opis;

    public Ekran(String opis) {
        this.opis = opis;
    }

    public void rozwin(){
        System.out.println(opis + "rozwiniety");
    }

    public void zwin(){
        System.out.println(opis + "zwiniety");
    }

    public String przeksztalcTxt(){
        return opis;
    }
}
