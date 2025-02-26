package javadas.generics.collectionsFramework;

import java.util.Comparator;

public class CompLastNames implements Comparator<String> {
    // Использовать метод thenComparing() для сортировки
    // счетов вкладчиков сначала по фамилии, а затем по имени


    @Override
    public int compare(String o1, String o2) {
        int i , j;
        // найти индекс символа, с которого начинается фамилия
       i = o1.lastIndexOf(' ');
       j = o2.lastIndexOf(' ');
       return o1.substring(i).compareToIgnoreCase(o2.substring(j));
    }
}
