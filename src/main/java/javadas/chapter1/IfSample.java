package javadas.chapter1;

public class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;
        if (x < y) {
            System.out.println("x < y");
        }
        x = x * 2;
        if (x == y) {
            System.out.println("x = y");
        }
        x = x * 2;
        if (x > y) {
            System.out.println("x > y");
        }

        Integer l = new Integer(4);
        if (l.toString().intern() == l.toString().intern()) {
            System.out.println("Равный");
        } else {
            System.out.println("Неравный");
        }


    }
}
