package behavior.quack;

import behavior.QuackBehavior;

/**
 * This is a duck behavior that makes no sound.
 * Created by Sripadmanaban on 9/1/2015.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I cannot speak..");
    }
}
