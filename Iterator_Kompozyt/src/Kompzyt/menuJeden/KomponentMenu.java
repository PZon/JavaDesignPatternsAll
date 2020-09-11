package Kompzyt.menuJeden;

/**
 * Created by PZON_SM on 03.08.2020.
 **/
public abstract class KomponentMenu {
    public void dodaj(KomponentMenu komponentMenu){
        throw new UnsupportedOperationException();
    }
    public void usun(KomponentMenu komponentMenu){
        throw new UnsupportedOperationException();
    }
     public KomponentMenu getChild(int i){
        throw new UnsupportedOperationException();
    }

    public String getNazwa(){
        throw new UnsupportedOperationException();
    }

    public String getOpis(){
        throw new UnsupportedOperationException();
    }

    public double getCena(){
        throw new UnsupportedOperationException();
    }

    public boolean isVeggie(){
        throw new UnsupportedOperationException();
    }

    public void wydruk(){
        throw new UnsupportedOperationException();
    }

}
