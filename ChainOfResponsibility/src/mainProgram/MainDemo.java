package mainProgram;

import mainProgram.Message.Txt;
import mainProgram.Staff.*;

/**
 * Created by PZON_SM on 14.08.2020.
 **/
public class MainDemo {
    public static void main(String[] args){
        Txt txt = new Txt("Txt to Director", 30, Rank.VCEDIRECTOR);

        Staff lab = new Labour();
        Staff man = new Manager();
        Staff vce = new VceDirector();
        Staff alpha = new Director();

        lab.setSuperior(man);
        man.setSuperior(vce);
        vce.setSuperior(alpha);

        lab.processMessage(txt);
    }
}
