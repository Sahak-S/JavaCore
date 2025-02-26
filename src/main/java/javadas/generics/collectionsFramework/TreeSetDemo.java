package javadas.generics.collectionsFramework;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();
        TreeSet<Integer> ts1 = new TreeSet<>();
        ts.add("S");
        ts.add("N");
        ts.add("O");
        ts.add("A");
        ts.add("Z");
        System.out.println(ts);

        ts1.add(2);
        ts1.add(8);
        ts1.add(0);
        ts1.add(-45);
        ts1.add(14);
        System.out.println(ts1);


        if (ts.equals(ts1)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        if (ts1.add(0) == ts1.add(14)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        if (ts.add("A") == ts1.add(2)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        System.out.println(ts.subSet("N","Z"));
        //System.out.println(ts);

    }
}
