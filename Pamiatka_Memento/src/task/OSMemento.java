package task;

import java.util.Date;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
class OSMemento {
    private int backupNr;
    private Date backupDate;

    OSMemento(int backupNr, Date backupDate) {
        this.backupNr = backupNr;
        this.backupDate = backupDate;
    }

    int getBackupNr() {
        return backupNr;
    }

    Date getBackupDate() {
        return backupDate;
    }
}
