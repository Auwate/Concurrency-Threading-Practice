package Main.SynchronizedPractice.NumberExchanger;

/**
 * Shared class between the CountRunnable and PrintRunnable classes.
 *
 * All it does is hold an object which is mutated and accessed regularly.
 */
public class NumberExchanger {

    private static Object object = null;

    public synchronized void setObject (Object o) {

        object = o;

    }

    public synchronized Object getObject () {

        return object;

    }

    public void setObj (Object o) {

        synchronized (this) {
            object = o;
        }

    }

    public Object getObj () {

        synchronized (this) {
            return object;
        }

    }

}
