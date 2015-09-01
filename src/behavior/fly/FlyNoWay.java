package behavior.fly;

import behavior.FlyBehavior;

/**
 * This is the fly behavior where the duck cannot fly.
 * Created by Sripadmanaban on 9/1/2015.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cannot fly..");
    }
}
