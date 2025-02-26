package javadas.generics.collectionsFramework;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2A {

    public static void main(String[] args) {

        // использовать метод thenComparing() для создания
        // компаратора, сравнивающего сначала фамилии, а
        // затем Ф.И.О. вкладчиков, если фамилии одинаковы

        CompLastNames compLn = new CompLastNames();
        Comparator<String> compLastThenFirst = compLn.thenComparing(new CompThenByFirstName());

        // создать древовидное отображение

        TreeMap<String,Double> tm = new TreeMap<String,Double>(compLastThenFirst);

        // ввести элементы в древовидное отображение

        tm.put("Poxos Poxosyan",new Double(3214.12));
        tm.put("Petros Petrosyan",new Double(145.12));
        tm.put("David Davtyan",new Double(-3714.12));
        tm.put("Vardan Vardanyan",new Double(34.12));
        tm.put("Aram Petrosyan",new Double(374.12));

        // получить множество элементов
        Set<Map . Entry<String , Double>> set = tm.entrySet();

        // вывести элементы из множества

        for (Map.Entry<String,Double> me : set){
            System.out.print(me.getKey() + " ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // внести сумму 1000 на счет David Davtyan
        double balance = tm.get("David Davtyan");
        tm.put("David Davtyan", balance + 1000);
        System.out.println(tm.get("David Davtyan"));
    }
}
