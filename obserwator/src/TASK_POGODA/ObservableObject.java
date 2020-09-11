package TASK_POGODA;

/**
 * Created by PZON_SM on 07.08.2020.
 **/
public interface ObservableObject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
