package Order;

import Notification.Observer;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by PZON_SM on 07.08.2020.
 **/
public class Order implements ObservableObject {
    private Long orderNumber;
    private OrderStatus orderStatus;
    private Set<Observer> registeredObservers = new HashSet<Observer>();

    public Order(Long orderNumber, OrderStatus orderStatus) {
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }

    @Override
    public void addObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : registeredObservers){
         observer.updateOrderStatus(this);
        }
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void changeOrderStatus(OrderStatus orderStatus){
        setOrderStatus(orderStatus);
        notifyObservers();
    }
}
