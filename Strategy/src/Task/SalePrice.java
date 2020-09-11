package Task;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
public class SalePrice implements PricingStrategy {
    @Override
    public void calculatePrice(int price, boolean newsletterReg) {
        if(!newsletterReg){
            System.out.println("You must be registered for newsletter to get discount");
        }else{
            System.out.println("Registered user price: "+(price*0.5));
        }
    }
}
