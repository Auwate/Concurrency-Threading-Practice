package Main.SynchronizedPractice.Visibility;

public class SynchedCounter {

    private long counter = 0;

    public synchronized void incCounter () {

        this.counter++;

    }

    public synchronized long getCounter () {

        return this.counter;

    }

}
