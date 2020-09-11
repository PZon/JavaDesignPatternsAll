package task;

import java.util.Date;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
public class OS {
    private int backupNr;
    private Date backupDate;

    public OS() {
        this.backupNr = 0;
    }

    public void makeBackup(){
        this.backupNr++;
        this.backupDate = new Date();

        System.out.println("New backup nr: "+this.backupNr+" has been created. Date: "+this.backupDate);
    }

    public OSMemento save(){
        return new OSMemento(this.backupNr, this.backupDate);
    }

    public void load(OSMemento osMemento){
        this.backupNr = osMemento.getBackupNr();
        this.backupDate = osMemento.getBackupDate();
    }
}
