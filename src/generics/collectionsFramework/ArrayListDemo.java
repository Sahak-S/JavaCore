package generics.collectionsFramework;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        System.out.println(al.size());

        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        al.add("F");
        al.add(3, "A2");

        System.out.println(al.size());

        al.remove("F");
        al.remove(2);
        System.out.println(al.size());
        System.out.println(al);
    }
}
