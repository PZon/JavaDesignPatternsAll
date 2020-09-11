package udemyTask;

/**
 * Created by PZON_SM on 14.08.2020.
 **/
public class TaskDemo {
    public static void main(String[] args){
        WorkingDay e1 = new EmployeeOne();
        WorkingDay e2 = new EmployeeTwo();
        WorkingDay e3 = new EmployeeThree();

        e1.job(Transport.FOOT);
        System.out.println("========================================");
        e1.job(Transport.BIKE);
        System.out.println("========================================");
        e2.job(Transport.MOTORBIKE);
        System.out.println("========================================");
        e3.job(Transport.CAR);
    }
}
