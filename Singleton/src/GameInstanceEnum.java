/**
 * Created by PZON_SM on 07.08.2020.
 **/
public enum GameInstanceEnum {
    INSTANCE("Piotr");
    private int healthPoints =100;
    private String playerName="";

    GameInstanceEnum(String playerName) {
        this.playerName = playerName;
    }

    public void run(){
        while(true){
            //jakis kod;
        }
    }
}
