package javadas.packagesAnderfaces.Interfaces;

public class Testiface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient c1 = new AnotherClient();
        c.callback(42);
        c = c1;
        c.callback(42);
    }
}
