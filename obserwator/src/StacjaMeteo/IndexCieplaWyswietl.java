package StacjaMeteo;

/**
 * Created by PZON_SM on 10.06.2020.
 **/
public class IndexCieplaWyswietl implements  Obserwator, WyswietlElement {
    float indexCiepla = 0.0f;
    private DanePogodowe danePogodowe;

    public IndexCieplaWyswietl(DanePogodowe danePogodowe) {
        this.danePogodowe = danePogodowe;
        danePogodowe.zarejestrujObserwatora(this);
    }

    @Override
    public void akltualizacja(float temp, float wilgotnosc, float cisnienie) {
        indexCiepla = obliczIndexCiepla(temp,wilgotnosc);
        wyswietl();
    }

    @Override
    public void wyswietl() {
        System.out.println("Index ciepła wynosi: "+indexCiepla);
        System.out.println("====================================");
    }

    private float obliczIndexCiepla(float t, float rh) {
        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh)
                + (0.00941695 * (t * t)) + (0.00728898 * (rh * rh))
                + (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }
}
