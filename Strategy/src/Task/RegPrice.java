package Task;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
public class RegPrice implements PricingStrategy {
    @Override
    public void calculatePrice(int price, boolean newsletterReg) {
        if(newsletterReg){
            System.out.println("If You are sign in for newsletter so your price is: "+(price*0.5));
        }else{
            System.out.println("Price is: "+price);
        }

    }
}
