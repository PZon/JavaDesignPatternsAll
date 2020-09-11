package Task;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
public class CalcDemo {
    public static void main(String[] args){
        PriceCalc priceCalc = new PriceCalc();
        priceCalc.setPricingStrategy(new RegPrice());
        priceCalc.calculate(100, true);
        priceCalc.calculate(100, false);
        priceCalc.setPricingStrategy(new SalePrice());
        priceCalc.calculate(50, true);
        priceCalc.calculate(50, false);
    }
}
