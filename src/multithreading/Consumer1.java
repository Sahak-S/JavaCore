package multithreading;

public class Consumer1 implements Runnable {

    Q q;

    Consumer1(Q q) {
        this.q = q;
        new Thread(this, "Потребитель").start();
    }


    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }
}
