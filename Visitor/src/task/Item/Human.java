package task.Item;

import task.Visitor.Visitor;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
public class Human implements Item {
    private String firstName;
    private String lastName;
    private boolean isRegularCustomer;

    public Human(String firstName, String lastName, boolean isRegularCustomer) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isRegularCustomer = isRegularCustomer;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isRegularCustomer() {
        return isRegularCustomer;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
