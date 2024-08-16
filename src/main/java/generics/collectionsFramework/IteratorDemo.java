package generics.collectionsFramework;

import treatmentExclusion.Train02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("A");
        al.add("12");
        al.add("java");
        al.add("@#$");
        al.add("W");

        System.out.println(al);

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();
/////////////////////////////////////////
        ListIterator<String> iter = al.listIterator();
        while (iter.hasNext()){
            String element = iter.next();
            System.out.print(element +" ");
        }
        System.out.println();

        itr = al.iterator();
        while (itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        while (iter.hasPrevious()){
            String element = iter.previous();
            System.out.print(element + " ");
        }

    }
}
