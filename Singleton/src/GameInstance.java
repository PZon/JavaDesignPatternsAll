import java.io.Serializable;

/**
 * Created by PZON_SM on 07.08.2020.
 **/
public class GameInstance implements Serializable {
    public static final long serialVersionUID = 13131313;
    private int healthPoints =100;
    private String playerName="";
    //private static GameInstance instance;//*1
    private static GameInstance instance = new GameInstance();

    private GameInstance() {
    }

    public static GameInstance getInstance() {
        return instance;
    }

    /*1
        public static GameInstance getInstance() {
            if(instance==null){
                synchronized (GameInstance.class) {
                    if (instance == null) instance = new GameInstance();
                }
            }

            return instance;
        }
    */
    public void run(){
        while(true){
            //jakis kod;
        }
    }

    protected Object readResolve(){
        return getInstance();
    }
}
