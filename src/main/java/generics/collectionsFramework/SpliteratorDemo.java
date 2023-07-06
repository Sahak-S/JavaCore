package generics.collectionsFramework;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorDemo {

    public static void main(String[] args) {

        ArrayList<Double> vals = new ArrayList<>();

        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);
        System.out.println("Coдepжимoe списочного массива vals:\n");

        Spliterator<Double> spltitr = vals.spliterator();
        while(spltitr.tryAdvance((n) -> System.out.println(n)));
        System.out.println();

        spltitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while(spltitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n) )) ) ;
         // вызвать метод forEachRemaining() для вывода
        // содержимого списочного массива sqrs
        System.out.print(
                "Содержимое списочного массива sqrs:\n");
        spltitr = sqrs.spliterator();
        spltitr.forEachRemaining((n) -> System.out.println(n));
        System.out.println();

    }
}
