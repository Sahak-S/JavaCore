package javadas.tread;

import java.io.IOException;

public class NewThread implements Runnable {

    String name;
    Thread t;


    NewThread(String kol) {
        name = kol;
        t = new Thread(this, name);
        System.out.println("Дoчepний поток создан " + t);
        t.start();
    }


    @Override
    public void run() {
        long currentTime = System.currentTimeMillis();
        try {
            Test.file("C:\\Users\\User\\Desktop\\sample.txt", "as");
        } catch (IOException e) {
            e.printStackTrace();
        }

        long finishTime = System.currentTimeMillis();
        System.out.println("time: " + (finishTime - currentTime));


    }
}