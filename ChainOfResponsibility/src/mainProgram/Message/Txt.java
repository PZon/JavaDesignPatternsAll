package mainProgram.Message;

import mainProgram.Staff.Rank;

/**
 * Created by PZON_SM on 14.08.2020.
 **/
public class Txt {
    private String message;
    private int code;
    private Rank rank;

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }

    public Rank getRank() {
        return rank;
    }

    public Txt(String message, int code, Rank rank) {
        this.message = message;
        this.code = code;
        this.rank = rank;
    }
}
