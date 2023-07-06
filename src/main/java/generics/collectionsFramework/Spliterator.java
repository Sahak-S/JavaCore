package generics.collectionsFramework;


import java.util.ArrayDeque;
import java.util.Collections;

public interface Spliterator {

    public static void main(String[] args) {


        ArrayDeque<String> ad = new ArrayDeque<>();

        ad.add("A");
        ad.add("b");
        ad.add("c");
        ad.add("d");
        ad.add("e");

        for (String s : ad) {
            System.out.print(s + " ");
        }

        ad.addLast("kk");
        ad.iterator();
        System.out.print(ad);
        ad.clone();
        System.out.println(ad);

        //ad.isEmpty();
        ad.poll();
        ad.pop();
        System.out.println(ad);
        ad.addAll(Collections.singleton("kj"));
        System.out.println(ad);

        ad.addFirst("l");
        System.out.println(ad);

//        ad.clear();
//        System.out.println(ad);

        ad.descendingIterator();
        System.out.println(ad);

        ad.element();
        System.out.println(ad.pop());


    }
}
