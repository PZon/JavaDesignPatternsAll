package adapterTask;

import java.time.LocalDate;

/**
 * Created by PZON_SM on 13.08.2020.
 **/
public class LApi1_impl implements LApi1 {
    @Override
    public boolean isAvailable(String title) {
        System.out.println("I am checking availability: "+title);
        return true;
    }

    @Override
    public LocalDate dueDate(String title, String pesel) {
        System.out.println("I am checking due date: "+title);
        return LocalDate.now();
    }

    @Override
    public boolean reserve(String title, String pesel) {
        System.out.println("I am reserving: "+title);
        return true;
    }
}
