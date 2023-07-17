package Main.SynchronizedPractice.Visibility;

public class UnsynchedCounter {

    private long counter = 0;

    public void incCounter () {

        this.counter++;

    }

    public long getCounter () {

        return this.counter;

    }

}
