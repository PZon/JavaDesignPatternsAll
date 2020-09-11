package StarCafe;

/**
 * Created by PZON_SM on 18.06.2020.
 **/
public class DodWhisky extends SkladnikDekorator{
    Napoj napoj;


    public DodWhisky(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String getOpis() {
        return napoj.getOpis();
    }

    @Override
    public double koszt() {
        return 0.70 + napoj.koszt();
    }
}
