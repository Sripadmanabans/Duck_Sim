package behavior.quack;

import behavior.QuackBehavior;

/**
 * This is a quack behavior but sounds like squeak.
 * Created by Sripadmanaban on 9/1/2015.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can SQUEAK!!");
    }
}
