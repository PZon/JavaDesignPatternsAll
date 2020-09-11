package StarCafe;

/**
 * Created by PZON_SM on 17.06.2020.
 **/
public class KawaZMlekiem extends Napoj {
    public KawaZMlekiem() {
        opis = "Kawa z mlekiem";
    }

    @Override
    public double koszt() {
        return 1.50;
    }
}
