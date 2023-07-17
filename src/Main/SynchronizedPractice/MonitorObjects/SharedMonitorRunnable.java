package Main.SynchronizedPractice.MonitorObjects;

/**
 * This thread will run the DifferentMonitorObjects' incCounter() method, and there will be two
 * threads of this type running. Because incCounter() is controlled by the monitor1 object, only
 * one of the threads will be able to run it at a time.
 */
public class SharedMonitorRunnable implements Runnable {

    String name;
    DifferentMonitorObjects sharedMonitorObjects;

    public SharedMonitorRunnable (String name, DifferentMonitorObjects objects) {

        this.name = name;
        this.sharedMonitorObjects = objects;

    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {

            sharedMonitorObjects.incCounter();

        }

    }

}
