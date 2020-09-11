package mainProgram.Staff;

import mainProgram.Message.Txt;

/**
 * Created by PZON_SM on 14.08.2020.
 **/
public class Manager extends Staff {
    private static final int CODE = 20;
    private static final String NAME = "Ysinki - Manager";


    @Override
    public void processMessage(Txt txt) {
        if(txt.getRank().equals(Rank.MANAGER) && txt.getCode() == CODE){
            System.out.println(NAME + " got message: "+txt.getMessage());
        }else{
            getSuperior().processMessage(txt);
        }
    }
}
