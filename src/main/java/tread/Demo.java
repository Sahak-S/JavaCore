package tread;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Demo implements Runnable {
    String name;
    Thread t;

    Demo(String fol) {
        name = fol;
        t = new Thread(this, name);
        System.out.println("поток создан " + t);
        t.start();
    }

    @Override
    public void run() {

        try {
            long currentTime = System.currentTimeMillis();
           // Test.file("C:\\Users\\User\\Desktop\\sample.txt", ";");
            File file = new File("C:\\Users\\User\\Desktop\\sample.txt");
            Scanner scanner = new Scanner(file);
            String a = "as";
            int words = 0;
            int lines = 0;
            while (scanner.hasNextLine()) {
                lines++;
                String[] array = scanner.nextLine().split(" ");
                words = words + array.length;
            }
            System.out.println("number of words :" + words);
            System.out.println("number of lines :" + lines);
            long finishTime = System.currentTimeMillis();
            System.out.println("time: " + (finishTime - currentTime));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        new Demo("Thread");
        new NewThread("NewThread");
    }
}
