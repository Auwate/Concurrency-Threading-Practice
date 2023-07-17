package Main.SynchronizedPractice.StaticAndInstanceExchanger;

/**
 * This class has both static and instance fields, as well as static and instance methods. This is
 * supposed to highlight the ability for instance and static fields to be accessed and altered
 * at the same time. Note that this does not mean two threads can access a static field at the
 * same time, nor does it mean two can access an instance method at the same time.
 */
public class MixedNumberExchanger {

    private static Object staticObject = null;
    private Object instanceObject = null;

    public synchronized static void setStaticObject (Object o) {
        staticObject = o;
    }

    public synchronized void setInstanceObject (Object o) {
        this.instanceObject = o;
    }

}
