package adapterTask;

import java.time.LocalDate;

/**
 * Created by PZON_SM on 13.08.2020.
 **/
public class User {

    private String fname;
    private String sndName;
    private String pesel;
    private LocalDate dOfB;

    public User(String fname, String sndName, String pesel) {
        this.fname = fname;
        this.sndName = sndName;
        this.pesel = pesel;
        this.dOfB = LocalDate.now();
    }

    public String getFname() {
        return fname;
    }

    public String getSndName() {
        return sndName;
    }

    public String getPesel() {
        return pesel;
    }

    public LocalDate getdOfB() {
        return dOfB;
    }
}
