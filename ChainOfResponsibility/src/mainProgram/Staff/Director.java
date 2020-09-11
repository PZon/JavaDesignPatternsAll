package mainProgram.Staff;

import mainProgram.Message.Txt;

/**
 * Created by PZON_SM on 14.08.2020.
 **/
public class Director extends Staff{
    private static final int CODE = 40;
    private static final String NAME = "Alfa - Director";


    @Override
    public void processMessage(Txt txt) {
        if(txt.getRank().equals(Rank.DIRECTOR) && txt.getCode() == CODE){
            System.out.println(NAME + " got message: "+txt.getMessage());
        }else{
            System.out.println("Unknown recipient !!!");
        }
    }
}
