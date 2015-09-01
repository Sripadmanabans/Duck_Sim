package ducks;

import basic.Duck;
import behavior.fly.FlyWithWings;
import behavior.quack.Quack;

/**
 * This is a type of duck.
 * Created by Sripadmanaban on 8/27/2015.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a Mallard Duck!!");
    }
}
