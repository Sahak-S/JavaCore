package multithreading;

public class Caller1 implements Runnable {

    String msg;
    Callme target;
    Thread t;

    public Caller1(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    // синхронизированные вызовы метода call()
    @Override
    public void run() {
        synchronized (target) {
            // синхронизированный блок
            target.caii(msg);
        }
    }
}
