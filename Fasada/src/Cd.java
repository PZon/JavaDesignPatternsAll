/**
 * Created by PZON_SM on 20.07.2020.
 **/
public class Cd {
    String opis;
    int utworNr=0;
    TunerDvdCd tunerDvdCd;
    String tytul="";

    public Cd(String opis, TunerDvdCd tunerDvdCd) {
        this.opis = opis;
        this.tunerDvdCd = tunerDvdCd;
    }

    public void wlacz(){
        System.out.println(opis + "wlczony");
    }

    public void wylacz(){
        System.out.println(opis + "wylczony");
    }

    public String przeksztalcTxt(){
        return opis;
    }

    public void play(int utworNr, String tytul){
        this.utworNr = utworNr;
        this.tytul = tytul;

        if(utworNr==0) System.out.println("CD puste - włóż płyte");
        else if(tytul=="") System.out.println("Piosenka nr:"+ utworNr+" brak tytułu");
        else System.out.println("Piosenka nr:"+ utworNr+" tytułu: "+tytul);
    }
}
