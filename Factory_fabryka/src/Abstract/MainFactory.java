package Abstract;

/**
 * Created by PZON_SM on 11.08.2020.
 **/
public abstract class MainFactory {
    abstract public UnitLotnictwo createLotnictwo(UnitType type);
    abstract public UnitPiechota createPiechota(UnitType type);
    abstract public UnitMarynarka createMarynarka(UnitType type);
}
