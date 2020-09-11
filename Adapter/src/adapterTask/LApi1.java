package adapterTask;

import java.time.LocalDate;

/**
 * Created by PZON_SM on 13.08.2020.
 **/
public interface LApi1 {
    boolean isAvailable(String title);
    LocalDate dueDate(String title, String pesel);
    boolean reserve(String title, String pesel);
}
