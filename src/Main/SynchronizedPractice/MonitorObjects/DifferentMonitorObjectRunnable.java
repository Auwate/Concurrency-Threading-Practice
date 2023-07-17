package Main.SynchronizedPractice.MonitorObjects;

/**
 * This thread will run DifferentMonitorObjects' incCounter2() method. Because it is controlled
 * by monitor2 instead of monitor1, this thread will be able to run without issue, while the
 * other two compete for the same method.
 */
public class DifferentMonitorObjectRunnable implements Runnable {

    String name;
    DifferentMonitorObjects sharedMonitorObjects;

    public DifferentMonitorObjectRunnable (String name, DifferentMonitorObjects objects) {

        this.name = name;
        sharedMonitorObjects = objects;

    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {

            sharedMonitorObjects.incCounter2();

        }

    }

}
