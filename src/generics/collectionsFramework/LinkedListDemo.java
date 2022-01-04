package generics.collectionsFramework;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("A");
        ll.add("C");
        ll.add("U");
        ll.add("K");
        ll.add("L");

        ll.addLast("H");                       //ավելացվում է էլեմենտը մասիվի վերջում

        ll.addFirst("F");                      // ավելացվում է էլեմենտը մասիվի սկզբում

        ll.add(1, "A55");             // ավելացնում է էլեմենտը նշված ինդեքսում

        System.out.println(ll);

        ll.remove("A");                        //  կջնջի նշված էլեմենտը
        ll.remove(2);                        //  կջնջի նշված քանակով

        System.out.println(ll);

        ll.removeFirst();                        // կջնջի առաջին էլեմենտը
        ll.removeLast();                       // կջնջի վերջին էլեմենտը

        System.out.println(ll);

        String val = ll.get(2);              //    կնշի մասիվի որ էլեմենտը պիտի փոփխվի
        ll.set(0, val + " փոփոխվել է");      //    կնշի մասիվում որտեղ պիտի փոփոխվի
        System.out.println(ll);

    }
}
