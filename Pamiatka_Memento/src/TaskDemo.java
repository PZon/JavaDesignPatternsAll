import task.OS;
import task.OSCaretaker;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
public class TaskDemo {
    public static void main(String[] args) throws InterruptedException {
        OSCaretaker osCaretaker = new OSCaretaker();
        OS os = new OS();

        os.makeBackup();
        Thread.sleep(2000);

        os.makeBackup();
        Thread.sleep(2000);

        osCaretaker.addMemento(os.save());

        os.makeBackup();
        Thread.sleep(2000);

        os.makeBackup();
        Thread.sleep(2000);

        os.load(osCaretaker.getOsMemento());

        os.makeBackup();
        Thread.sleep(2000);
    }
}
