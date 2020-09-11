package YTFacade;

/**
 * Created by PZON_SM on 08.09.2020.
 **/
public class ATMDemo {
    public static void main(String[] args) {
        ATMFacade atmFacade = new ATMFacade(12344321, 1234);
        atmFacade.withdrawal(900);
        atmFacade.credit(200);
        atmFacade.withdrawal(400);
    }
}
