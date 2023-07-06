package multithreading;

public class Q1 {

    int n;
    boolean valuesSet = false;

    synchronized int get() {
        while (!valuesSet) ;
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Иcключeниe типа InterruptedException перехвачено");
            }
            System.out.println("Пoлyчeнo: " + n);
            valuesSet = false;
            notify();


        return n;
    }

    synchronized void put(int n) {
        while (valuesSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Иcключeниe типа InterruptedException перехвачено");
            }
            this.n = n;
            valuesSet = true;
            System.out.println("Oтпpaвлeнo: " + n);
            notify();
        }
    }
}
