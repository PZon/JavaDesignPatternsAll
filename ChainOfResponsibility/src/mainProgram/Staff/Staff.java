package mainProgram.Staff;

import mainProgram.Message.Txt;

/**
 * Created by PZON_SM on 14.08.2020.
 **/
public abstract class Staff {
    private Staff superior;

    public abstract void processMessage(Txt txt);

    public Staff getSuperior() {
        return superior;
    }

    public void setSuperior(Staff superior) {
        this.superior = superior;
    }
}
