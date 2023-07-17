package Main.SynchronizedPractice.NumberExchangerStatic;

/**
 * This practice is meant to highlight the use of static classes and synchronization
 */
public class ThreadPractice2 {

    public static void main (String[] args) {

        StaticNumberExchanger exchanger = new StaticNumberExchanger();

        Thread thread1 = new Thread (new StaticCountRunnable(exchanger));
        Thread thread2 = new Thread (new StaticPrintRunnable(exchanger));

        thread1.start();
        thread2.start();

    }

}
