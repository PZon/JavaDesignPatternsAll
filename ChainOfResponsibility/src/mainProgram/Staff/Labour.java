package mainProgram.Staff;

import mainProgram.Message.Txt;

/**
 * Created by PZON_SM on 14.08.2020.
 **/
public class Labour extends Staff {
    private static final int CODE = 10;
    private static final String NAME = "Xinski - pracownik biurowy";


    @Override
    public void processMessage(Txt txt) {
        if(txt.getRank().equals(Rank.LABOUR) && txt.getCode() == CODE){
            System.out.println(NAME + " got message: "+txt.getMessage());
        }else{
            getSuperior().processMessage(txt);
        }
    }
}
