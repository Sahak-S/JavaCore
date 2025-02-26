package javadas.generics.collectionsFramework;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();

        hs.add("core");
        hs.add("google");
        hs.add("java");
        hs.add("java");
        hs.add("c++");
        hs.add("c#");
        hs.add("windows");
        hs.add("word");
        hs1.add(44);
        hs1.add(2);
        hs1.add(45);
        hs1.add(4);
        hs1.add(1);
        System.out.println(hs);
        System.out.println(hs1);

        if (hs.equals(hs1)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }


        if (hs.add("java") == hs1.add(85)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        System.out.println(hs );
        System.out.println(hs1);


    }
}
