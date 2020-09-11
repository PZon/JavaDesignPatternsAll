package Pilot3;

/**
 * Created by PZON_SM on 13.07.2020.
 **/
public class Swiatlo {
    String gdzie;
    int poziom;

    public Swiatlo(String gdzie) {
        this.gdzie = gdzie;
    }

    public void wlaczSwiatlo(){
        poziom = 100;
        System.out.println(gdzie +": Swiatlo wlaczone");
    }

    public void wylaczSwiatlo(){
        poziom = 0;
        System.out.println(gdzie +": Swiatlo wylaczone");
    }

    public void jasnosc(int poziom){
        this.poziom = poziom;
        if(poziom == 0) wylaczSwiatlo();
        else System.out.println("Swiatlo ustawione na poziomie: "+poziom+"%");
    }

    public int getPoziom(){
        return poziom;
    }
}
