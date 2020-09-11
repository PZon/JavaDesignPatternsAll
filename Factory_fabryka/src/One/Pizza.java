package One;

import java.util.ArrayList;

/**
 * Created by PZON_SM on 25.06.2020.
 **/
abstract public class Pizza {
    String name;
    String bread;
    String sauce;
    ArrayList toppings = new ArrayList();

    public String getName() {
        return name;
    }

    public void prepare(){
        System.out.println("Preparing " + name);
    }
    public void bake() {
        System.out.println("Baking " + name);
    }
    public void cut() {
        System.out.println("Cutting " + name);
    }
    public void box() {
        System.out.println("Boxing " + name);
    }

 /*   public String toString(){
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(bread + "\n");
        display.append(sauce + "\n");
        for(int i=0; i<toppings.size();i++){
            display.append((String)toppings.get(i) + "\n");
        }
        return display.toString();
    }*/
}