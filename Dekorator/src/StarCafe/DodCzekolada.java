package StarCafe;

/**
 * Created by PZON_SM on 17.06.2020.
 **/
public class DodCzekolada extends SkladnikDekorator {
    Napoj napoj;

    public DodCzekolada(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String getOpis() {
        return napoj.getOpis();
    }

    @Override
    public double koszt() {
        return 0.30 + napoj.koszt();
    }
}
