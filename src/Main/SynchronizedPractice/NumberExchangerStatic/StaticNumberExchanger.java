package Main.SynchronizedPractice.NumberExchangerStatic;

import Main.SynchronizedPractice.NumberExchanger.NumberExchanger;

/**
 * Static version of NumberExchanger. This class highlights the use of the synchronized keyword
 * on static methods.
 *
 * Static methods differ from nonstatic methods in a couple ways. Most importantly, only one
 * thread can access any static synchronized method at a time.
 */
public class StaticNumberExchanger {

    private static Object object = null;

    public static synchronized Object getObject () {

        return object;

    }

    public static synchronized void setObject (Object o) {

        object = o;

    }

    public static Object getObj () {

        synchronized (NumberExchanger.class) {

            return object;

        }

    }

    public static void setObj (Object o) {

        synchronized (NumberExchanger.class) {

            object = o;

        }

    }

}
