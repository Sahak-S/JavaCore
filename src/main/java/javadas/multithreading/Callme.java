package javadas.multithreading;


          //  Эта программа не синхронизирована
public class Callme {
    void caii(String msg){
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
        System.out.println("]");
    }


}
