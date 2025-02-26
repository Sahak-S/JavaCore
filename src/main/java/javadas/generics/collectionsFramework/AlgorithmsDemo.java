package javadas.generics.collectionsFramework;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {

    // создать неинициализированный связный список
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(-8);
        ll.add(12);
        ll.add(0);
        ll.add(4);
        ll.add(1);

        // создать компаратор с обратным упорядочением
        Comparator<Integer> r = Collections.reverseOrder();

        // отсортировать список с помощью этого компаратора

        Collections.sort(ll, r);

        System.out.print("Cпиcoк отсортирован в обратном порядке: ");

        for (int i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();

        // перетасовать список
        Collections.shuffle(ll);
        // вывести перетасованный список
        System.out.print("Cпиcoк перетасован: ");

        for (int i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("min : " + Collections.min(ll));
        System.out.println("max : " + Collections.max(ll));

    }
}
