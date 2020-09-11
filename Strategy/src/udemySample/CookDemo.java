package udemySample;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
public class CookDemo {
    public static void main(String[] args) {
        Cook cook = new Cook("Anonymous");
        cook.setEggCooker(new ScrambledEgg());
        System.out.print(cook.getName()+" ");
        cook.cooking();
        cook.setEggCooker(new SoftEgg());
        cook.cooking();
    }
}
