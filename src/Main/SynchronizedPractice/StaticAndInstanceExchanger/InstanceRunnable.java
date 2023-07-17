package Main.SynchronizedPractice.StaticAndInstanceExchanger;

/**
 * This class will print out every time it edits the values in the MixedNumberExchanger. This
 * class highlights how you can access both static and instance methods. Specifically, we show
 * how instance controls and class controls are different.
 */
public class InstanceRunnable implements Runnable {

    private MixedNumberExchanger exchanger;

    public InstanceRunnable(MixedNumberExchanger exchanger) {

        this.exchanger = exchanger;

    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {

            this.exchanger.setInstanceObject("" + i);
            System.out.println("Instance successful");

        }

    }

}
