package udemyPrzyklad;

/**
 * Created by PZON_SM on 13.08.2020.
 **/
public class MauntainDec extends  TerrainDec{
    public MauntainDec(Terrain terrain) {
        super(terrain);
    }

    @Override
    public String getDescription() {
        return terrain.getDescription()+", Mountain";
    }

    @Override
    public int getFuelCost() {
        return terrain.getFuelCost()+10;
    }
}
