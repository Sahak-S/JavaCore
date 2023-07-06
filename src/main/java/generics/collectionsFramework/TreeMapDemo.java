package generics.collectionsFramework;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<String, Double> tm = new TreeMap<>();

        tm.put("Poxox Poxosyan", new Double(123.14));
        tm.put("David Poxosyan", new Double(-458.14));
        tm.put("Aram Poxosyan", new Double(589.14));
        tm.put("Poxox Petrosyan", new Double(0.125));
        tm.put("Mkrtich  Petrosyan", new Double(-19.0));
        System.out.println(tm);
        // получить множество записей

        Set<Map.Entry<String, Double>> set = tm.entrySet();
        for (Map.Entry<String, Double> std : set) {
            System.out.print(std.getKey() + " : ");
            System.out.println(std.getValue());
            System.out.println(std.hashCode());

        }
        System.out.println();

        // внести сумму 1000 на счет Mkrtich  Petrosyan
        double balance = tm.get("Mkrtich  Petrosyan");
        tm.put("Mkrtich  Petrosyan", balance + 1000);
        System.out.println(tm);

    }
}
