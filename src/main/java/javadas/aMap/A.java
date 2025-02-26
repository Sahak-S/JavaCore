package javadas.aMap;

import java.util.*;

public class A {
    public static Map<String, Integer> countNames(List<String> names) {
        Map<String, Integer> maps = new HashMap<>();
        for (String name : names) {
            if (maps.get(name) == null) {
                maps.put(name, 1);
            } else {
                int count;
                count = maps.get(name);
                maps.put(name, ++count);
            }
        }
        return maps;
    }

    public static void main(String[] args) {

        List<String> names = new LinkedList<>();

        names.add("poxos");
        names.add("petros");
        names.add("martiros");
        names.add("babken");
        names.add("babken");
        names.add("poxos");

        Set<Map.Entry<String,Integer>> entris = countNames(names).entrySet();
        for (Map.Entry<String, Integer> entry : entris) {
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }
    }
}