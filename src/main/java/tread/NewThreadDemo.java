package tread;

import multithreading.NewThread0;

public class NewThreadDemo {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        new NewThread("Oдин");  //запустить потоки на исполнение


        long finishTime = System.currentTimeMillis();
        System.out.println("time: " + (finishTime - currentTime));
        try {
            // ожидать завершения других потоков исполнения
            Thread.sleep(1);
        } catch (InterruptedException е) {
            System.out.println("Глaвный поток прерван");
        }
        System.out.println("Глaвный поток завершен.");
    }

}
