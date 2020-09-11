package StacjaMeteo;

/**
 * Created by PZON_SM on 27.05.2020.
 **/


public class StacjaMeteo {
    public static void main(String[] args){
        DanePogodowe danePogodowe = new DanePogodowe();

        WarunkiBiezaceWyswietl warunkiBiezaceWyswietl= new WarunkiBiezaceWyswietl(danePogodowe);
        StatystykaWyswietl statystykaWyswietl= new StatystykaWyswietl(danePogodowe);
        PrognozaWyswietl prognozaWyswietl= new PrognozaWyswietl(danePogodowe);
        IndexCieplaWyswietl indexCieplaWyswietl = new IndexCieplaWyswietl(danePogodowe);

        danePogodowe.ustawOdczyt(12, 70, 10);
        danePogodowe.ustawOdczyt(22, 90, 13);
        danePogodowe.ustawOdczyt(33, 80, 11);
    }
}
