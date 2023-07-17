package Main.SynchronizedPractice.StaticAndInstanceExchanger;

public class StaticRunnable implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {

            MixedNumberExchanger.setStaticObject(""+i);
            System.out.println("Static successful");

        }

    }

}
