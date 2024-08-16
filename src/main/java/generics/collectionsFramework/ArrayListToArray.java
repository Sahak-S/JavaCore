package generics.collectionsFramework;

import java.util.ArrayList;

public class ArrayListToArray {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(-5);
        al.add(3);
        al.add(0);

        System.out.println(al);

        Integer[] ia = new Integer[al.size()];
        ia = al.toArray(ia);

        int sum = 0;
        for (int i : ia) {
            sum = i + 1;
        }
        System.out.println(sum);
    }
}
