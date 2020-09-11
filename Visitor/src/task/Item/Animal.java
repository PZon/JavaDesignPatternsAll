package task.Item;

import task.Visitor.Visitor;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
public class Animal implements Item {
    private String breed;
    private int weight;

    public Animal(String breed, int weight) {
        this.breed = breed;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
