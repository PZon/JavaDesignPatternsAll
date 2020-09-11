package task.Item;

import task.Visitor.Visitor;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
public class Shipment implements Item{
    private String prefix;
    private int serialNumber;
    private boolean isLarge;

    public Shipment(String prefix, int serialNumber, boolean isLarge) {
        this.prefix = prefix;
        this.serialNumber = serialNumber;
        this.isLarge = isLarge;
    }

    public String getPrefix() {
        return prefix;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public boolean isLarge() {
        return isLarge;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
