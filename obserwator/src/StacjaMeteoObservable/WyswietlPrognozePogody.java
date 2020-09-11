package StacjaMeteoObservable;

/**
 * Created by PZON_SM on 15.06.2020.
 **/
public class WyswietlPrognozePogody {
    public static void main(String[] args) {
        DanePogodowe danePogodowe = new DanePogodowe();
        AktualneWarunkiWyswietl aktualneWarunkiWyswietl = new AktualneWarunkiWyswietl(danePogodowe);
        StatystyczneDanePogodowe statystyczneDanePogodowe = new StatystyczneDanePogodowe(danePogodowe);
        PrognozowaneWrunkiWyswietl prognozowaneWrunkiWyswietl = new PrognozowaneWrunkiWyswietl(danePogodowe);
        IndexCiepla indexCiepla = new IndexCiepla(danePogodowe);

    danePogodowe.ustawPomiary(80, 65, 30.4f);
    danePogodowe.ustawPomiary(82, 70, 29.2f);
    danePogodowe.ustawPomiary(78, 90, 31f);

    }

}
