package adapterTask;

import java.time.LocalDate;

/**
 * Created by PZON_SM on 13.08.2020.
 **/
public class LApiAdapter implements LApi1{
    private final User user;
    private final LApi2 lApi2;

    public LApiAdapter(User user, LApi2 lApi2) {
        this.user = user;
        this.lApi2 = lApi2;
    }

    @Override
    public boolean isAvailable(String title) {
        return lApi2.nrOfCopies(title)>0;
    }

    @Override
    public LocalDate dueDate(String title, String pesel) {
        return lApi2.dueDate(title, user.getFname(), user.getSndName(), user.getdOfB());
    }

    @Override
    public boolean reserve(String title, String pesel) {
        return lApi2.reserve(title, user.getFname(), user.getSndName(), user.getdOfB());
    }
}
