package javadas.lesson3;

public class Conversion {
    public static void main(String[] args) {
        // մեծ  ծավալով հիշողոըթյունը փոքր ծավալի մեջ
        byte b;
        int i = 257;
        double d = 323.142;
        b = (byte) i;
        System.out.println("i and b" + i + " " + b);
        d = (int) d;
        System.out.println("d  and i" + d +" " + i);
        b =(byte) d;
        System.out.println("d and b" + d +" " + b);

    }
}
