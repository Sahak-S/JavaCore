package javadas.chapter1;

public class ForTest {
    public static void main(String[] args) {
        int x;


        int n = 33;
        int s = 0;
        while (n > 0) {
            s += n % 2;
            n /= 2;
        }
        System.out.println(s);
        System.out.println(n);


    }
}
