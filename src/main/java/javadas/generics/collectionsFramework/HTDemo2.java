package javadas.generics.collectionsFramework;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HTDemo2 {
    public static void main(String[] args) {

        Hashtable<String,Double> balance = new Hashtable<>();
        Enumeration<String> names;
        String str;
        Double bal;

        balance.put("poxps poxosyan",354.25);
        balance.put("Petros Petrosyan",3545.45);
        balance.put("Aram Manukyan",19.15);
        balance.put("Poxos Petrosyan",145.12);
        balance.put("Davit Davtyan",-19.25);

        // Вывести все счета в хеш-таблице. Сначала получить
        // представление всех ключей в виде множества
        Set<String> set = balance.keySet();

        // получить итератор

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()){
            str = itr.next();
            System.out.println(str + " ");
            balance.get(str);

        }
        System.out.println();

        // внести сумму 1000 на счет Poxos Petrosyan
        bal = balance.get("Poxos Petrosyan");
        balance.put("Poxos Petrosyan",bal + 1000);
        System.out.println("Hoвый остаток на счете : Poxos Petrosyan "
                + balance.get("Poxos Petrosyan"));

    }
}
