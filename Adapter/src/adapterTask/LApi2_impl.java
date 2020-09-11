package adapterTask;

import java.time.LocalDate;

/**
 * Created by PZON_SM on 13.08.2020.
 **/
public class LApi2_impl implements LApi2 {
    @Override
    public int nrOfCopies(String title) {
        System.out.println("I am checking availability: "+title);
        return 3;
    }

    @Override
    public LocalDate dueDate(String title, String fName, String sndName, LocalDate dOfB) {
        System.out.println("I am checking due date: "+title);
        return LocalDate.now();
    }

    @Override
    public boolean reserve(String title, String fName, String sndName, LocalDate dOfB) {
        System.out.println("I am reserving: "+title);
        return true;
    }
}
