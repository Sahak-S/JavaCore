package multithreading;

public class NewThreadd implements Runnable {

    String name;
    Thread t;

    NewThreadd(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Hoвый поток: " + t);
        t.start();  //запустить поток исполнения
    }

    //Точка входа в поток исполнения
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException е) {
            System.out.println(name + " прерван.");
        }
        System.out.println(name + " завершен.");

    }
}
