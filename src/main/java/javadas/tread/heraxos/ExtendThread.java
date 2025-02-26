package javadas.tread.heraxos;

import javadas.multithreading.NewThread;

public class ExtendThread {
    public static void main(String[] args) {

        new NewThread();     //создать новый поток исполнения
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Глaвный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException е) {
            System.out.println("Глaвный поток прерван.");
        }
        System.out.println("Глaвный поток завершен.");
    }

//    (
//    Stream<String> linses = Files.lines(Paths.get("C:\\Users\\User\\Desktop\\sample.txt"))) {
//        String line32 = linses.skip(31).findFirst().get();
}
