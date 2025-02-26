package javadas.grup1;

import java.util.Formatter;
import java.util.Locale;

public class Main1 {
    public static void main(String[] args) {

        Formatter formatter = new Formatter(Locale.ROOT);
        formatter.format("%.2E\n", 100.0 / 3.0);      //1
        formatter.format("%.2f", 100.0 / 3.0);        //2
        System.out.println(formatter);
        System.out.println();

        int n = 30;
        int s = 0;
        while (n > 0) {
            s += n % 2;
            n /= 2;
        }
        System.out.println(s);

        int k = 2;
        System.out.println(k <<3>>k ==k >>1<<k);

    }

}
