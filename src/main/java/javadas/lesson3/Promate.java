package javadas.lesson3;

public class Promate {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 5.67f;
        double d = 123.123;
        double result = (f * b) + (i / c) - (d + s);
        System.out.println((f * b) + "+" + (i / c) + "-" + (d + s));
        System.out.println("result =" + result);

    }
}
