package before;

/**
 * Created by PZON_SM on 14.08.2020.
 **/
public class DemoBefore {
    public static void main(String[] args){
        Txt txt =new Txt("Just TXT");

        CEO ceo = new CEO();
        ceo.setDirector(true);
        ceo.getTxt(txt);
    }
}
