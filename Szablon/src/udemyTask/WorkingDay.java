package udemyTask;

/**
 * Created by PZON_SM on 14.08.2020.
 **/
public abstract class WorkingDay {
    public final void job(Transport transport){
        wakeUp();
        getReady();
        caffe();
        goToWork(transport);
        work();
        homeTime();
    }

    public abstract void wakeUp();
    public abstract void caffe();
    public abstract void work();

    private void getReady(){
        System.out.println("Take a shower and wash your teeth, put clothes on");
    }
    private void homeTime(){
        System.out.println("Finally time to go home :) ");
    }

    private void goToWork(Transport transport){
        switch (transport){
            case FOOT:
                System.out.println("Trip to work takes about 20 mins");
                break;
            case BIKE:
                System.out.println("Trip to work takes about 15 mins");
                break;
            case MOTORBIKE:
                System.out.println("Trip to work takes about 10 mins");
                break;
            case CAR:
                System.out.println("Trip to work takes about 30 mins");
                break;
            default:System.out.println("Take a taxi");
            break;
        }
    }
}
