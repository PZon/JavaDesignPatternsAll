package Task;

/**
 * Created by PZON_SM on 14.08.2020.
 **/
public abstract class Child {
    Child tallerChild;

    public abstract void passRequest(MotherRequest request);

    public Child getTallerChild() {
        return tallerChild;
    }

    public void setTallerChild(Child tallerChild) {
        this.tallerChild = tallerChild;
    }
}
