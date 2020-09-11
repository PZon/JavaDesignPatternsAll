package Abstract;

/**
 * Created by PZON_SM on 11.08.2020.
 **/
public class Enemies extends MainFactory {
    @Override
    public UnitLotnictwo createLotnictwo(UnitType type) {
        switch (type){
            case PLANE:
                return new Plane(100, 70, 0);
            default:
                throw new UnsupportedOperationException("Unknown type");

        }
    }

    @Override
    public UnitPiechota createPiechota(UnitType type) {
        switch (type){
            case RIFLEMAN:
                return new Rifleman(100, 25, 0);
            case CANON:
                return new Canon(45,45,0);
            default:
                throw new UnsupportedOperationException("Unknown type");

        }
    }

    @Override
    public UnitMarynarka createMarynarka(UnitType type) {
        switch (type){
            case SHIP:
                return new Ship(100, 90, 0);
            default:
                throw new UnsupportedOperationException("Unknown type");

        }
    }

}
