package generics.collectionsFramework;

import java.util.TreeSet;

public class CompDemo2 {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>((o1Str, o2Str) ->o2Str.compareTo(o1Str) );
        ts.add("B");
        ts.add("M");
        ts.add("C");
        ts.add("A");
        ts.add("P");
        ts.add("S");

        for (String element : ts) {
            System.out.print(element + " ");

        }
        System.out.println();
    }
}
