package homework.thread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NewThread implements Runnable {
    Thread t;
    int size = 0;
    String keyword;

    NewThread() {
        // создать новый, второй поток исполнения
        t = new Thread(this, "Демонстрационный поток");
       // System.out.println("Дoчepний поток создан " + t);
        t.start();  // запустить поток исполнения
    }

    // Точка входа во второй поток исполнения
    public void run() {
        try {

            int size = 0;
            String txtPath = "C:\\Users\\User\\Desktop\\sample.txt";
            try (BufferedReader inputStream = new BufferedReader(new FileReader(txtPath))) {
                String findLine = "";
                while ((findLine = inputStream.readLine()) != null) {
                    if (findLine.contains(keyword)) {
                        System.out.println(findLine);
                        size++;
                    } else {
                    }
                }
                System.out.println(size);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void file(String txtPath, String keyword) throws IOException {
        int size = 0;
        //String line32 = Files.readAllLines(Paths.get("C:\\Users\\User\\Desktop\\sample.txt")).get(32);
        try (BufferedReader inputStream = new BufferedReader(new FileReader(txtPath))) {
            String findLine = "";
            while ((findLine = inputStream.readLine()) != null) {
                if (findLine.contains(keyword)) {
                    //  System.out.println(findLine);
                    size++;
                } else {
                }
            }
            System.out.println("lines where there is such a word " + size);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
