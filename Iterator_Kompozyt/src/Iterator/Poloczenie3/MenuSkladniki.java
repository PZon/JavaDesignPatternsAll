package Iterator.Poloczenie3;

/**
 * Created by PZON_SM on 27.07.2020.
 **/
public class MenuSkladniki {
    String nazwa;
    String opis;
    boolean veggie;
    double cena;

    public MenuSkladniki(String nazwa, String opis, boolean veggie, double cena) {
        this.nazwa = nazwa;
        this.opis = opis;
        this.veggie = veggie;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public boolean isVeggie() {
        return veggie;
    }

    public double getCena() {
        return cena;
    }
}
