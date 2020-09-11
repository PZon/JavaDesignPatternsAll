package StarCafe2;

/**
 * Created by PZON_SM on 24.06.2020.
 **/
public abstract class Drink{
    String opis = "nieznany napój";


    public String getOpis() {
        return opis;
    }


    public abstract double price();
}