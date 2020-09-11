package StarCafe;

/**
 * Created by PZON_SM on 18.06.2020.
 **/
public class Kawiarnia {
    public static void main(String args[]){
        Napoj napoj = new Espresso();
        System.out.println(napoj.getOpis()+" "+napoj.koszt()+" zł");

        Napoj napoj2 = new MalaCzarna();
        napoj2 = new DodBitaSmietana(napoj2);
        System.out.println(napoj2.getOpis()+" "+napoj2.koszt()+" zł");

        Napoj napoj3 = new KawaZMlekiem();
        napoj3=new DodBitaSmietana(napoj3);
        napoj3=new DodBitaSmietana(napoj3);
        napoj3=new DodCzekolada(napoj3);
        System.out.println(napoj3.getOpis()+" "+napoj3.koszt()+" zł");

        Napoj kawa = new IrishCofee();
        kawa = new DodWhisky(kawa);
        System.out.println(kawa.getOpis()+" "+kawa.koszt()+" zł");

    }
}
