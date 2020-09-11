package Ptaki;

import java.util.Random;

/**
 * Created by PZON_SM on 16.07.2020.
 **/
public class KaczkaAdapter implements Indyk {
    Kaczka kaczka;
    Random rand;

    public KaczkaAdapter(Kaczka kaczka) {
        this.kaczka = kaczka;
        rand = new Random();
    }

    @Override
    public void dziwekI() {
        kaczka.dzwiek();
    }

    @Override
    public void lot() {
        if(rand.nextInt(7)==0){
            kaczka.lot();
        }
    }
}
