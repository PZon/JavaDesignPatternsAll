package udemyPrzyklad;

/**
 * Created by PZON_SM on 13.08.2020.
 **/
public class AreaDemo {
    public static void main(String[] args) {
        Terrain terrain = new MauntainDec(new ForrestDec(new UnchartedArea()));
        System.out.println(terrain.getDescription()+" fuel cost: "+terrain.getFuelCost());
    }
}
