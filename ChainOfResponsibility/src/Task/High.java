package Task;

/**
 * Created by PZON_SM on 14.08.2020.
 **/
public class High extends Child {
    @Override
    public void passRequest(MotherRequest request) {
        if(request.getShelf().equals(Shelf.HIGH)) System.out.println("Antek zdjął słoik z półki!");
        else System.out.println("Who are you talking about");
    }
}
