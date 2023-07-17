package Main.SynchronizedPractice.NumberExchangerStatic;

/**
 * Can be thought of as the consumer thread
 *
 * Prints out the value of the object in NumberExchanger
 */
public class StaticPrintRunnable implements Runnable {

    private StaticNumberExchanger exchanger;

    public StaticPrintRunnable (StaticNumberExchanger exchanger) {

        this.exchanger = exchanger;

    }

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {

            System.out.println(exchanger.getObj());

        }

    }

}
