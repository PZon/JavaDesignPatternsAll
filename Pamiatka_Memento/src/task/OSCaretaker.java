package task;

import java.util.Date;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
public class OSCaretaker {
    private OSMemento osMemento;

    public void addMemento(OSMemento osMemento){
        this.osMemento = osMemento;
        System.out.println("Backup nr: "+osMemento.getBackupNr()+" has been saved. Date: "+osMemento.getBackupDate());
    }

    public OSMemento getOsMemento(){
        System.out.println("Backup nr: " + osMemento.getBackupNr() + " date: "+ osMemento.getBackupDate() + " has been loaded");
        return osMemento;
    }
}
