package Method;

/**
 * Created by PZON_SM on 11.08.2020.
 **/
public class DependFactory extends Factory {
    @Override
    public Unit createUnit(UnitType unitType) {
        switch (unitType){
            case TANK:
                return new Tank(100,0,0);
            case CANON:
                return  new Canon(75,0,0);
            case RIFLEMAN:
                return new Rifleman(25,0,0);
            default:
                throw new UnsupportedOperationException("No such a weapon");
        }
    }
}
