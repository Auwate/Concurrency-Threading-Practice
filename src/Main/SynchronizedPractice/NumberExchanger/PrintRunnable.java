package Main.SynchronizedPractice.NumberExchanger;

/**
 * Can be thought of as the consumer thread
 *
 * Prints out the value of the object in NumberExchanger
 */
public class PrintRunnable implements Runnable {

    private NumberExchanger exchanger;

    public PrintRunnable (NumberExchanger exchanger) {

        this.exchanger = exchanger;

    }

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {

            System.out.println(exchanger.getObj());

        }

    }

}
