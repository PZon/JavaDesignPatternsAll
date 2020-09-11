package udemyPrzyklad;

/**
 * Created by PZON_SM on 13.08.2020.
 **/
public abstract class TerrainDec extends Terrain{
    protected Terrain terrain;

    public TerrainDec(Terrain terrain) {
        super("", 0);
        this.terrain = terrain;
    }
}
