package Main.SynchronizedPractice.NumberExchanger;

/**
 * Can be thought of as a producer thread
 *
 * Sets the object in NumberExchanger to a String value
 */
public class CountRunnable implements Runnable {

    private NumberExchanger exchanger;

    public CountRunnable (NumberExchanger exchanger) {

        this.exchanger = exchanger;

    }

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {

            exchanger.setObj("" + i);

        }

    }

}
