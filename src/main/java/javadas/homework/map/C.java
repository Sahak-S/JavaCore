package javadas.homework.map;

import java.util.*;

public class C {
    public static void main(String[] args) {

        int count = 0;

        List<String> lists = new LinkedList<>();
        Set<String> sets = new HashSet<>();
        Map<String, Integer> maps = new HashMap<>();

        lists.add("mek");
        lists.add("erku");
        lists.add("ereq");
        lists.add("chors");
        lists.add("hing");


        sets.add("mek");
        sets.add("erku");
        sets.add("ereq");
        sets.add("chors");
        sets.add("hing");


        maps.put("mek", 1);
        maps.put("erku", 2);
        maps.put("ereq", 3);
        maps.put("chors", 4);
        maps.put("hing", 5);



        for (String s : maps.keySet()) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (Integer value : maps.values()) {
            System.out.print(value + " ");
        }
        System.out.println();
        for (Map.Entry<String, Integer> stringIntegerEntry : maps.entrySet()) {
            System.out.print(stringIntegerEntry + " ");
        }
        System.out.println();

        if (maps.get("mek").equals(sets.add("mek"))){
            System.out.println(count++);
        }else {
            System.out.println(false);
        }
        for (String mapsm : maps.keySet()) {
            System.out.println(maps.keySet());
        }

    }

}
