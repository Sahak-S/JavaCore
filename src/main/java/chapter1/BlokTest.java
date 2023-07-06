package chapter1;

public class BlokTest {
    public static void main(String[] args) {
        int x, y;
        y = 20;
        for (x = 0; x < 10; x = x + 1){
            System.out.print(" x =" + x);
            y = y - 2;
            System.out.println(" y =" + y);

        }

        System.out.println();

        int a = 1;
        int b = a++;
        int c = -a;
        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
        System.out.println();

        ///////////////////////////////////

        int m = 10;
        int n = 100;
        double k = (double) (m/n);
        String str = String.format("%1.4f", k);
        System.out.println(str);

        ///////////////////////////////////////////////

        Boolean b1 = new Boolean("true");
        System.out.println(b1);
        b1 = new Boolean("tRuE");
        System.out.println(b1);
        b1 = new Boolean("test");
        System.out.println(b1);
        b1 = new Boolean(true);
        System.out.println(b1);
        b1 = true;
        System.out.println(b1);

//////////////////////////////////////////

        int l = 12;
        while (l < 10) {
            l--;
        }
        System.out.print(l);
    }

    ///////////////////////////////////


}
