package StacjaMeteo;

/**
 * Created by PZON_SM on 10.06.2020.
 **/
public class PrognozaWyswietl implements  Obserwator, WyswietlElement {
    private float aktualneCisnienie = 29.9f;
    private float ostatnieCisnienie;
    private DanePogodowe danePogodowe;

    public PrognozaWyswietl(DanePogodowe danePogodowe) {
        this.danePogodowe = danePogodowe;
        danePogodowe.zarejestrujObserwatora(this);
    }

    @Override
    public void akltualizacja(float temp, float wilgotnosc, float cisnienie) {
        ostatnieCisnienie = aktualneCisnienie;
        aktualneCisnienie=cisnienie;

        wyswietl();
    }

    @Override
    public void wyswietl() {
        if(aktualneCisnienie>ostatnieCisnienie) System.out.println("Pogoda się poprawi wkrótce ");
        else if(aktualneCisnienie==ostatnieCisnienie) System.out.println("Pogoda się nie zmieni ");
        else if(aktualneCisnienie<ostatnieCisnienie)System.out.println("Może być już tylko gorzej ");
    }
}
