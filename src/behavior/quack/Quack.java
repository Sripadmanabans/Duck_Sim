package behavior.quack;

import behavior.QuackBehavior;

/**
 * This is the quack behaviour and the duck can quack.
 * Created by Sripadmanaban on 9/1/2015.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can QUACK!!");
    }
}
