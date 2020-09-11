package Sample;

import Sample.activity.Activity;
import Sample.activity.Fitness;
import Sample.activity.Squash;
import Sample.activity.Weights;
import Sample.visitor.VisitorImpl;

import java.util.Arrays;
import java.util.List;

/**
 * Created by PZON_SM on 28.08.2020.
 **/
public class GymDemo {
    public static void main(String[] args){
        Fitness fitness = new Fitness(60);
        Squash squash = new Squash(45);
        Weights weights = new Weights(13,50);
        VisitorImpl visitor = new VisitorImpl();

        fitness.accept(visitor);
        squash.accept(visitor);
        weights.accept(visitor);
        System.out.println("================================================");
        List<Activity> activities = Arrays.asList(squash,weights,fitness);
        activities.forEach(activity -> activity.accept(visitor));
    }
}
