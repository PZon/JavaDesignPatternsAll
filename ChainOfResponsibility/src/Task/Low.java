package Task;

/**
 * Created by PZON_SM on 14.08.2020.
 **/
public class Low extends Child {
    @Override
    public void passRequest(MotherRequest request) {
        if(request.getShelf().equals(Shelf.LOW)) System.out.println("Ania zdjęła słoik z półki!");
        else  getTallerChild().passRequest(request);
    }
}
