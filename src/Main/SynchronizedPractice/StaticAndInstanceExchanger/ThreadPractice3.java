package Main.SynchronizedPractice.StaticAndInstanceExchanger;

import Main.SynchronizedPractice.NumberExchangerStatic.StaticPrintRunnable;

public class ThreadPractice3 {

    public static void main (String[] args) {

        MixedNumberExchanger exchanger = new MixedNumberExchanger();
        Thread thread1 = new Thread (new StaticRunnable());
        Thread thread2 = new Thread (new InstanceRunnable(exchanger));

        thread1.start();
        thread2.start();

    }

}
