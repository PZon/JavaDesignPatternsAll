package udemyPrzyklad;

/**
 * Created by PZON_SM on 13.08.2020.
 **/
public class ForrestDec extends TerrainDec {

    public ForrestDec(Terrain terrain) {
        super(terrain);
    }

    @Override
    public String getDescription() {
        return terrain.getDescription()+", forrest";
    }

    @Override
    public int getFuelCost() {
        return terrain.getFuelCost()+3;
    }
}
