package before;

/**
 * Created by PZON_SM on 14.08.2020.
 **/
public class CEO {
    private boolean director;
    private boolean vceDirector;
    private boolean manager;

    public void setDirector(boolean director) {
        this.director = director;
    }

    public void setVceDirector(boolean vceDirector) {
        this.vceDirector = vceDirector;
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }

    public void getTxt(Txt txt){
        if(director) System.out.println("Director got message: "+ txt.getMessage());
        if(vceDirector) System.out.println("v-ce Director got message: "+ txt.getMessage());
        if(manager) System.out.println("Manager got message: "+ txt.getMessage());
        else System.out.println("Unknown recipient");
    }
}
