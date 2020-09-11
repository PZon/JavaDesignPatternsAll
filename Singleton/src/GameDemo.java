/**
 * Created by PZON_SM on 07.08.2020.
 **/
public class GameDemo {
    public static void main(String[] args){
        GameInstance gameInstance = GameInstance.getInstance();
        GameInstance gameInstance2 = GameInstance.getInstance();
        System.out.println(gameInstance==gameInstance2);

    }
}
