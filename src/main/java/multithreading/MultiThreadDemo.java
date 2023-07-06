package multithreading;

public class MultiThreadDemo {

    public static void main(String[] args) {

        new NewThread0("Oдин");  //запустить потоки на исполнение
        new NewThread0("Два");
        new NewThread0("Три");


        try {
            // ожидать завершения других потоков исполнения
            Thread.sleep(10000);
        } catch (InterruptedException е) {
            System.out.println("Глaвный поток прерван");
        }
        System.out.println("Глaвный поток завершен.");
    }
}
