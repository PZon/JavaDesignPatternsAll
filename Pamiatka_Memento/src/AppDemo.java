import mementApp.App;
import mementApp.AppManager;


/**
 * Created by PZON_SM on 27.08.2020.
 **/
public class AppDemo {
    public static void main(String[] args){
        AppManager appManager = new AppManager();
        App app = new App();

        app.setVersion(1.0);
        app.setVersion(1.1);
        app.setVersion(1.2);
        app.setVersion(1.3);

        appManager.addMemento(app.save());

        app.setVersion(1.4);
        app.setVersion(1.5);
        app.setVersion(2.0);
        app.load(appManager.getMemento(0));
    }
}
