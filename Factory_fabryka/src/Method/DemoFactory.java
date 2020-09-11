package Method;

/**
 * Created by PZON_SM on 11.08.2020.
 **/
public class DemoFactory {
    public static void main(String[] args){
        Factory factory = new DependFactory();
        Unit canon = factory.createUnit(UnitType.CANON);
        Unit tank = factory.createUnit(UnitType.TANK);
        Unit rifleman = factory.createUnit(UnitType.RIFLEMAN);

    }
}
