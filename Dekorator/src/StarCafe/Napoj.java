package StarCafe;

/**
 * Created by PZON_SM on 17.06.2020.
 **/
public abstract class Napoj{
    String opis = "nieznany napój";


    public String getOpis() {
        return opis;
    }


    public abstract double koszt();
}
