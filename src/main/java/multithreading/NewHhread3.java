package multithreading;

public class NewHhread3 implements Runnable {

    //Приостановка и возобновление исполнения потока современным способом

    String name; //имя потока исполнения
    Thread t;
    boolean suspendFlag;

    NewHhread3(String thredname) {
        name = thredname;
        t = new Thread(this, name);
        System.out.println("Hoвый поток: " + t);
        suspendFlag = false;
    }

    //Точка входа в поток исполнения
    @Override
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + " : " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + "прерван.");
        }
        System.out.println(name + " завершен.");
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }

}
