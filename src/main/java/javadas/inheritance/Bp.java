package javadas.inheritance;

public class Bp extends Ap {

    int k;

    Bp(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        System.out.println("k =" + k);
    }

}
