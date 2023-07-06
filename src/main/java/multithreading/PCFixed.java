package multithreading;

public class PCFixed {
    public static void main(String[] args) {

        Q q = new Q();

        new Producer1(q);
        new Consumer1(q);
        System.out.println("Для остановки нажмите Ctrl+C.");
    }
}
