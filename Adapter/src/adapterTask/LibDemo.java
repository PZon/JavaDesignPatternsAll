package adapterTask;

/**
 * Created by PZON_SM on 13.08.2020.
 **/
public class LibDemo {
    public static void main(String[] args){
       // LApi1 lApi1 = new LApi1_impl();
        LApi2 lApi2 = new LApi2_impl();
        User user = new User("Peter","Jakis", "123465");
        LApiAdapter lApiAdapter = new LApiAdapter(user,lApi2);

        Book book = new Book(user,lApiAdapter);
        book.checkAvailability("Chłopcy z placu broni");
        book.toReturn("Jakas książka",user);
        book.reserve("jakas książka","123465");
    }
}
