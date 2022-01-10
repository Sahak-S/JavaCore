package multithreading;

public class NewThread0 implements Runnable {

    String name; //имя потока исполнения
    Thread t;

    NewThread0(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Hoвый поток: " + t);
        t.start();   //запустить поток на исполнение
    }

    //Точка входа в поток исполнения
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + "· " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException е) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен.");

    }
}
