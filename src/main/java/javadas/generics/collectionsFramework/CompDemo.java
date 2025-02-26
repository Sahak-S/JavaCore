package javadas.generics.collectionsFramework;

import java.util.TreeSet;

public class CompDemo {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("B");
        ts.add("M");
        ts.add("C");
        ts.add("A");
        ts.add("P");
        ts.add("S");
        // вывести элементы из древовидного множества

        for (String element : ts) {
            System.out.print(element + " ");

        }
    }
}
