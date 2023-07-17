package Main.SynchronizedPractice.MonitorObjects;

/**
 * This class highlights the usage of multiple monitor objects to use in synchronized methods.
 */
public class ThreadPractice4 {

    public static void main (String[] args) {

        DifferentMonitorObjects sharedMonitorObjects = new DifferentMonitorObjects();

        SharedMonitorRunnable runnable = new SharedMonitorRunnable("Thread1", sharedMonitorObjects);
        SharedMonitorRunnable runnable1 = new SharedMonitorRunnable("Thread2", sharedMonitorObjects);

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable1);
        thread1.start();
        thread2.start();

        DifferentMonitorObjects unSharedMonitorObject = new DifferentMonitorObjects();
        DifferentMonitorObjectRunnable unsharedRunnable = new DifferentMonitorObjectRunnable("Thread3", unSharedMonitorObject);
        Thread thread3 = new Thread(unsharedRunnable);
        thread3.start();

    }

}
