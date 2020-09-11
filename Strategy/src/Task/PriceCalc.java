package Task;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
public class PriceCalc {
    private PricingStrategy pricingStrategy;

    public PricingStrategy getPricingStrategy() {
        return pricingStrategy;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public void calculate(int price, boolean reg){
        this.pricingStrategy.calculatePrice(price, reg);
    }
}
