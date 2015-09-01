package basic;

import behavior.FlyBehavior;
import behavior.QuackBehavior;

/**
 * This is the basic structure for the ducks.
 * Created by Sripadmanaban on 8/27/2015.
 */
public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    /**
     * This is the function that is used to say the duck can swim.
     */
    public void swim() {
        System.out.println("I can swim");
    }

    /**
     * This is the function that is used to display the name of the duck.
     */
    public abstract void display();

    /**
     * This is the function that is used to perform the quack.
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    /**
     * This is the function that is used to perform the fly.
     */
    public void performFly() {
        flyBehavior.fly();
    }

    /**
     * This function can be used to set the fly behavior on the fly.
     *
     * @param flyBehavior An object of a class that implements the FlyBehavior interface.
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * This function is used to change the quack behavior on the fly
     *
     * @param quackBehavior An object of a class that implements the QuackBehavior interface.
     */
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
