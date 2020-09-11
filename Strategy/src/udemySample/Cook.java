package udemySample;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
public class Cook {
    private String name;
    private EggCooker eggCooker;

    public Cook(String name) {
        this.name = name;
    }

    public void cooking(){
        this.eggCooker.cookingEgg();
    }

    public String getName() {
        return name;
    }

    public EggCooker getEggCooker() {
        return eggCooker;
    }

    public void setEggCooker(EggCooker eggCooker) {
        this.eggCooker = eggCooker;
    }
}
