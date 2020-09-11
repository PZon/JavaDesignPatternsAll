package adapterTask;

import java.time.LocalDate;

/**
 * Created by PZON_SM on 13.08.2020.
 **/
public interface LApi2 {
    int nrOfCopies(String title);
    LocalDate dueDate(String title, String fName, String sndName, LocalDate dOfB);
    boolean reserve(String title, String fName, String sndName, LocalDate dOfB);
}
