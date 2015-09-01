package behavior.fly;

import behavior.FlyBehavior;

/**
 * This is the fly behavior class that allows flight
 * Created by Sripadmanaban on 9/1/2015.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly!!");
    }
}
