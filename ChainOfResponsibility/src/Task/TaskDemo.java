package Task;

/**
 * Created by PZON_SM on 14.08.2020.
 **/
public class TaskDemo {
    public static void main(String[] args){
        MotherRequest request = new MotherRequest(Shelf.HIGH);
        Child anka = new Low();
        Child tomek = new Medium();
        Child antek = new High();

        anka.setTallerChild(tomek);
        tomek.setTallerChild(antek);

        anka.passRequest(request);

    }
}
