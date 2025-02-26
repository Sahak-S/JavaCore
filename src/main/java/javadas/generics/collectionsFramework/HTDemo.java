package javadas.generics.collectionsFramework;

import java.util.Enumeration;
import java.util.Hashtable;

public class HTDemo {

    public static void main(String[] args) {

        Hashtable<String,Double> balance = new Hashtable<>();
        Enumeration<String> names;
        String str;
        Double bal;

        balance.put("poxps poxosyan",354.25);
        balance.put("Petros Petrosyan",3545.45);
        balance.put("Aram Manukyan",19.15);
        balance.put("poxos petrosyan",145.12);
        balance.put("Davit Davtyan",-19.25);

        //показать все счета в хеш-таблице

        names = balance.keys();
        while (names.hasMoreElements()){
            str  = names.nextElement();
            System.out.println(str + " : " + balance.get(str));
        }
        System.out.println();
        // внести сумму 1000 на счет Aram Manukyan
        bal = balance.get("Aram Manukyan");
        balance.put("Aram Manukyan",bal + 1000);
        System.out.println("Hoвый остаток на счете : Aram Manukyan "
                + balance.get("Aram Manukyan"));


    }
}
