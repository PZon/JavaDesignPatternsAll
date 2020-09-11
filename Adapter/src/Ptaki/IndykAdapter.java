package Ptaki;

/**
 * Created by PZON_SM on 16.07.2020.
 **/
public class IndykAdapter implements Kaczka {
    Indyk indyk;

    public IndykAdapter(Indyk indyk) {
        this.indyk = indyk;
    }

    @Override
    public void dzwiek() {
        indyk.dziwekI();
    }

    @Override
    public void lot() {
        for(int i=3; i>0; i--){
            indyk.lot();
        }
    }
}
