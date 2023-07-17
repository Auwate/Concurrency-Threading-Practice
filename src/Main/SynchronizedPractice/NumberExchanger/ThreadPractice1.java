package Main.SynchronizedPractice.NumberExchanger;

/**
 * This practice is meant to highlight instance methods using the synchronized keyword.
 */
public class ThreadPractice1 {

    public static void main(String[] args) {

        NumberExchanger exchanger = new NumberExchanger();

        Thread thread1 = new Thread (new CountRunnable(exchanger));
        Thread thread2 = new Thread (new PrintRunnable(exchanger));

        thread1.start();
        thread2.start();

    }

}