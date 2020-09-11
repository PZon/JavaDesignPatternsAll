package Czekolada;

/**
 * Created by PZON_SM on 07.07.2020.
 **/
public class CzekoladaDemo {
    public static void main(String args[]) {
        MieszalniaCzekolady kontener = MieszalniaCzekolady.pobierzInstansje();
        kontener.nalej();
        kontener.zagotuj();
        kontener.wylej();

        MieszalniaCzekolady kontener2 = MieszalniaCzekolady.pobierzInstansje();
        kontener2.nalej();
        kontener2.zagotuj();
        kontener2.wylej();

        MieszalniaGalarety miska = MieszalniaGalarety.pobierzInstansje();
        miska.nalej();
        miska.zagotuj();
        miska.wylej();
        MieszalniaGalarety miska2 = MieszalniaGalarety.pobierzInstansje();
        miska2.nalej();
        miska2.zagotuj();
        miska2.wylej();
    }
}
