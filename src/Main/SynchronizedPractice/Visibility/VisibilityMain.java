package Main.SynchronizedPractice.Visibility;

/**
 * This class holds main for testing visibility with/without synchronized keyword. The first
 * set of threads work on the UnsynchedCounter class, showing visibility problems as the end
 * number should be 2 million
 *
 *
 */
public class VisibilityMain {

    static final int TOTAL_THREADS = 2;

    public static void main (String[] args) {

        UnsynchedCounter counter = new UnsynchedCounter();

        Runnable unSyncRunnable = new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 1_000_000; i++) {

                    counter.incCounter();

                }

                System.out.println(counter.getCounter());

            }

        };

        Thread[] threads = new Thread[TOTAL_THREADS];

        /**
         * Easy way of keeping track of all threads
         */
        for (int i = 0; i < TOTAL_THREADS; i++) {

            Thread thread = new Thread(unSyncRunnable);
            threads[i] = thread;
            thread.start();

        }

        for (int i = 0; i < TOTAL_THREADS; i++) {

            try {
                threads[i].join();
            }
            catch (InterruptedException exception) {
                exception.printStackTrace();
            }

        }

        /**
         * This section will go over synchronized methods, and how their visibility will
         * guarantee 2 million as an end value.
         */
        SynchedCounter synchedCounter = new SynchedCounter();
        Runnable synchedRunnable = new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 1_000_000; i++) {
                    synchedCounter.incCounter();
                }

                System.out.println(synchedCounter.getCounter());

            }

        };

        for (int i = 0; i < TOTAL_THREADS; i++) {

            Thread thread = new Thread(synchedRunnable);
            threads[i] = thread;
            thread.start();

        }

        for (int i = 0; i < TOTAL_THREADS; i++) {

            try {
                threads[i].join();
            }
            catch (InterruptedException exception) {
                exception.printStackTrace();
            }

        }

    }

}
