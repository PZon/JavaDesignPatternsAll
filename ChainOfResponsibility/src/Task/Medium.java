package Task;

/**
 * Created by PZON_SM on 14.08.2020.
 **/
public class Medium extends Child {
    @Override
    public void passRequest(MotherRequest request) {
        if(request.getShelf().equals(Shelf.MEDIUM)) System.out.println("Tomek zdjął słoik z półki!");
        else getTallerChild().passRequest(request);
    }
}
