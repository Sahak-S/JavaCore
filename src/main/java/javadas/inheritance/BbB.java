package javadas.inheritance;

public class BbB extends AaA{

    int k;

    BbB(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
        System.out.println("k =" + k);
    }

}

