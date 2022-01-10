package multithreading;

public class Producer1 implements Runnable {

    Q q;

    Producer1(Q q) {
        this.q = q;
        new Thread(this, "Поставщик").start();


    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}
