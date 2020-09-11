package StarCafe;

/**
 * Created by PZON_SM on 17.06.2020.
 **/
public class DodBitaSmietana extends SkladnikDekorator {
    Napoj napoj;

    public DodBitaSmietana(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String getOpis() {
        return napoj.getOpis();
    }

    @Override
    public double koszt() {
        return 0.50 + napoj.koszt();
    }
}
