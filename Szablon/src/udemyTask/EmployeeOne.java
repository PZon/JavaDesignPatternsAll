package udemyTask;

/**
 * Created by PZON_SM on 14.08.2020.
 **/
public class EmployeeOne extends WorkingDay{
    @Override
    public void wakeUp() {
        System.out.println("I wake up about 6:30am");
    }

    @Override
    public void caffe() {
        System.out.println("I drink white coffee");

    }

    @Override
    public void work() {
        System.out.println("I use to work about 8 hours");
    }
}
