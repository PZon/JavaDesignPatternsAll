package Notification;

import Order.Order;

/**
 * Created by PZON_SM on 07.08.2020.
 **/
public class Email implements Observer {
    public void updateOrderStatus(Order order){
        System.out.println("Email: Your order: "+order.getOrderNumber()+" status has been changed: "+order.getOrderStatus());
    }
}
