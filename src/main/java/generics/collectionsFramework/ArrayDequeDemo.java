package generics.collectionsFramework;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

    public static void main(String[] args) {

        ArrayDeque<String> adq = new ArrayDeque<>();

        adq.add("m");
        adq.add("1");
        adq.add("nm");
        adq.add("p");

        while (adq.peek() != null){
            System.out.print(adq.pop() + " ");
        }
        System.out.println(adq);

    }
}
