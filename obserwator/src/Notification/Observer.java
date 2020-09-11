package Notification;

import Order.Order;

/**
 * Created by PZON_SM on 07.08.2020.
 **/
public interface Observer {
    void updateOrderStatus(Order order);
}
