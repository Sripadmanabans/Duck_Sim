package ducks;

import basic.Duck;
import behavior.fly.FlyNoWay;
import behavior.quack.Quack;

/**
 * This is a duck type used for testing.
 * Created by Sripadmanaban on 9/1/2015.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a Model duck, hope I can fly..");
    }
}
