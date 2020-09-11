package StacjaMeteo;

/**
 * Created by PZON_SM on 27.05.2020.
 **/
public class WarunkiBiezaceWyswietl implements  Obserwator, WyswietlElement {
    private float temperatura;
    private float wilgotnosc;
    private float cisnienie;
    private Podmiot danePogodowe;

    public WarunkiBiezaceWyswietl(Podmiot danePogodowe) {
        this.danePogodowe = danePogodowe;
        danePogodowe.zarejestrujObserwatora(this);
    }

    @Override
    public void wyswietl() {
        System.out.println("Warunki bieżące " + temperatura+ " stopni C oraz "+wilgotnosc+" % wilgotnosc");
    }

    @Override
    public void akltualizacja(float temperatura, float wilgotnosc, float cisnienie) {
        this.temperatura = temperatura;
        this.wilgotnosc =wilgotnosc;
        this.cisnienie = cisnienie;
        wyswietl();
    }
}
