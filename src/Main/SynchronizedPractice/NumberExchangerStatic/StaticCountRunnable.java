package Main.SynchronizedPractice.NumberExchangerStatic;

/**
 * Can be thought of as a producer thread
 *
 * Sets the object in NumberExchanger to a String value
 */
public class StaticCountRunnable implements Runnable {

    private StaticNumberExchanger exchanger;

    public StaticCountRunnable (StaticNumberExchanger exchanger) {

        this.exchanger = exchanger;

    }

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {

            exchanger.setObj("" + i);

        }

    }

}
