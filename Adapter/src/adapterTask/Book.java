package adapterTask;

import java.time.LocalDate;

/**
 * Created by PZON_SM on 13.08.2020.
 **/
public class Book {
    private final User user;
    private final LApi1 lApi1;

    public Book(User user, LApi1 lApi1) {
        this.user = user;
        this.lApi1 = lApi1;
    }

    public boolean checkAvailability(String title){
        return lApi1.isAvailable(title);
    }

    public boolean reserve(String title, String pesel){
        return lApi1.reserve(title, pesel);
    }

    public LocalDate toReturn(String title, User user){
        return lApi1.dueDate(title, user.getPesel());
    }
}
