import basic.Duck;
import ducks.MallardDuck;
import ducks.ModelDuck;

/**
 * This is the simulator.
 * Created by Sripadmanaban on 8/27/2015.
 */
public class MiniDuckSimulator {

    public static void main(String args[]) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.performQuack();
    }

}
