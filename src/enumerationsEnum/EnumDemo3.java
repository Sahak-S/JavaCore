package enumerationsEnum;

public class EnumDemo3 {

    public static void main(String[] args) {

        Apple1 ap;

        // вывести цену на яблоко сорта Winesap
        System.out.println("Яблoкo сорта WINESAP стоит " + Apple1.WINESAP.getPrice() + " центов. \n");

        // вывести цены на все сорта яблок
        System.out.println("Цeны на все сорта яблок:");
        for (Apple1 a : Apple1.values()) {
            System.out.println(a + " стоит " + a.getPrice() + " центов. ");
        }

    }
}
