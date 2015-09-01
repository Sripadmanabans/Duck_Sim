package behavior.fly;

import behavior.FlyBehavior;

/**
 * This is the class that makes the duck rocket powered.
 * Created by Sripadmanaban on 9/1/2015.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am rocket powered, zoooooom...");
    }
}
