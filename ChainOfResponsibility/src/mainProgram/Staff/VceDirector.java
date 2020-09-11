package mainProgram.Staff;

import mainProgram.Message.Txt;

/**
 * Created by PZON_SM on 14.08.2020.
 **/
public class VceDirector extends Staff {
    private static final int CODE = 30;
    private static final String NAME = "Zetsiński - v-ce Director";


    @Override
    public void processMessage(Txt txt) {
        if(txt.getRank().equals(Rank.VCEDIRECTOR) && txt.getCode() == CODE){
            System.out.println(NAME + " got message: "+txt.getMessage());
        }else{
            getSuperior().processMessage(txt);
        }
    }
}
