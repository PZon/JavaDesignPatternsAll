package Iterator.Polaczenie2;

/**
 * Created by PZON_SM on 24.07.2020.
 **/
public class PozycjaMenu {
    String nazwa;
    String opis;
    boolean veggie;
    double cena;

    public PozycjaMenu(String nazwa, String opis, boolean veggie, double cena) {
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
