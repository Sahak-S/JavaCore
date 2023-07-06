package aList;

import java.util.HashMap;
import java.util.List;

public class ArrayList {

    public static void main(String[] args) {

        String[] array = {"mek", "kjhnb", "mek", "ddd", "oiu", "www", "sss", "bgh", "sss"};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i].equals(array[j])) && (i != j)) {
                    System.out.println( "Կրկնվող տարր : " + array[j]);

                }
            }
        }







        String str = "beautiful beach";
        char[] carray = str.toCharArray();
        System.out.println("строка:" + str);
        System.out.print("Повторяющиеся символы в приведенной выше строке: ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (carray[i] == carray[j]) {
                    System.out.print(carray[j] + " ");
                    break;
                }
            }
        }
        String[] m = "abc abcde abcdef words abc abc g".split(" ");
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        for (int i = 0; i < m.length; i++) {
            if (h.containsKey(m[i])) {
                h.replace(m[i], h.get(m[i]) + 1);
            } else {
                h.put(m[i], 1);
            }
        }

//        String s = null;
//        int p = 0;
//        for (String w : h.keySet()) {
//            if (p < h.get(w)) {
//                p = h.get(w);
//                s = w;
//            }
//        }
//
//        System.out.println("Самое повторяющееся слово: " + w + " (встречается " + h.get(w) + " раз)");

    }

}
