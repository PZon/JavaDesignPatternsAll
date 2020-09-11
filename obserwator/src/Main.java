import Notification.AppNotification;
import Notification.Email;
import Notification.TxtMessage;
import Order.Order;
import Order.OrderStatus;

/**
 * Created by PZON_SM on 07.08.2020.
 **/
public class Main {
    public static void main(String[] args){
        Order order = new Order(13L, OrderStatus.REGISTERED);

        AppNotification appNotification = new AppNotification();
        Email email = new Email();
        TxtMessage txtMessage = new TxtMessage();

      //  appNotification.updateOrderStatus(order);
        //email.updateOrderStatus(order);
        //txtMessage.updateOrderStatus(order);

        order.addObserver(appNotification);
        order.addObserver(txtMessage);
        order.addObserver(email);
        order.notifyObservers();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        order.removeObserver(txtMessage);
        order.changeOrderStatus(OrderStatus.SENT);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        order.removeObserver(email);
        order.changeOrderStatus(OrderStatus.COLLECTED);

    }
}
