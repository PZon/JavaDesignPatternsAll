package mementApp;

/**
 * Created by PZON_SM on 27.08.2020.
 **/
public class App {
    private Double version;

    public void setVersion(Double version) {
        this.version = version;
        System.out.println("New version has been implemented: "+ version);
    }

    public AppMemento save(){
        return new AppMemento(this.version);
    }

    public void load(AppMemento appMemento){
        this.version = appMemento.getVersion();
    }
}
