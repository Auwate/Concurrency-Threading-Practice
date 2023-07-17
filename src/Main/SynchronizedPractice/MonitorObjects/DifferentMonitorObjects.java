package Main.SynchronizedPractice.MonitorObjects;

/**
 * This method utilizes two monitor objects, monitor1 and monitor2, which are both of type Object.
 * There are two methods, incCounter() and incCounter2(), which increment counter1 and counter2
 * respectively. They use different control objects, so both can be run by different threads.
 */
public class DifferentMonitorObjects {

    private Object monitor1 = new Object();
    private Object monitor2 = new Object();
    private int counter1 = 0;
    private int counter2 = 0;
    public void incCounter () {

        synchronized (this.monitor1) {

            counter1++;
            System.out.println("Counter 1 incremented to " + counter1 + " by " + Thread.currentThread().getName());

        }

    }

    public void incCounter2 () {

        synchronized (this.monitor2) {

            counter2++;
            System.out.println("Counter 2 incremented to " + counter2 + " by " + Thread.currentThread().getName());

        }

    }

}
