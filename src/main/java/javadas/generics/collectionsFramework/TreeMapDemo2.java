package javadas.generics.collectionsFramework;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {

        // Использовать компаратор для сортировки счетов
        // по фамилиям вкладчиков

        TreeMap<String, Double> tm = new TreeMap<>();

        tm.put("Poxox Poxosyan", new Double(123.14));
        tm.put("David Poxosyan", new Double(-458.14));
        tm.put("Aram Petrosyan", new Double(589.14));
        tm.put("Poxox Petrosyan", new Double(0.125));
        tm.put("Mkrtich  Petrosyan", new Double(-19.0));
        System.out.println(tm);
        //получить множество элементов
        Set<Map.Entry<String, Double>> set = tm.entrySet();
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + " ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //внести сумму 1000 на счет  Aram Petrosyan
        Double balance = tm.get("Aram Petrosyan");
        tm.put("Aram Petrosyan", balance + 1000);
        System.out.println(tm.get("Aram Petrosyan"));
    }
}
