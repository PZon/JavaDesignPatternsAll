package Kompzyt.menuJeden;

/**
 * Created by PZON_SM on 03.08.2020.
 **/
public class PozycjaMenu extends KomponentMenu {
    String nazwa;
    String opis;
    double cena;
    boolean veggie;

    public PozycjaMenu(String nazwa, String opis, double cena, boolean veggie) {
        this.nazwa = nazwa;
        this.opis = opis;
        this.cena = cena;
        this.veggie = veggie;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public double getCena() {
        return cena;
    }

    @Override
    public boolean isVeggie() {
        return veggie;
    }

    public void wydruk(){
        System.out.print(" "+ getNazwa());
        if(isVeggie()) System.out.print("(v)");
        System.out.println(", cena: "+ getCena());
        System.out.println("   --- "+ getOpis());
    }
}
