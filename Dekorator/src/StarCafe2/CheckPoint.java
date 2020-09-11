package StarCafe2;

/**
 * Created by PZON_SM on 24.06.2020.
 **/
public class CheckPoint {
    public static void main(String args[]){
        Drink drink = new IrishCoffe();
        AddOn drink2=new AddWhisky(drink);
        drink2=new WSmall(drink2);
        System.out.println(drink.getOpis()+" "+drink2.getAddOn()+" "+drink2.price()+" zł");
    }
}
