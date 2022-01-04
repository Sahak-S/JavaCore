package generics.collectionsFramework;

import java.util.Comparator;

public class TComp implements Comparator<String> {
    @Override
    public int compare(String o1Str, String o2Str) {
        int i, j, k;

        // найти индекс символа, с которого начинается фамилия

        i = o1Str.lastIndexOf(' ');
        j = o1Str.lastIndexOf(' ');
        k = o1Str.substring(i).compareTo(o2Str.substring(j));

        if (k == 0) {                                                                  //Фамилии совпадают, проверить имя
            return o1Str.compareTo(o2Str);                                             //и фамилию полностью

        } else {
            return k;
        }
    }
}
