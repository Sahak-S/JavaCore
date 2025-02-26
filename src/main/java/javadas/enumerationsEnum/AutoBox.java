package javadas.enumerationsEnum;

public class AutoBox {

    public static void main(String[] args) {

        Integer iOb = 100;         // автоупаковка значения типа int
        int i = iOb;               // автораспаковка значения типа int

        System.out.println(i + " " + iOb);
    }
}
