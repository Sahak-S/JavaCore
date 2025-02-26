package javadas.generics.collectionsFramework;

import java.util.Comparator;

public  class MyComp implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
        String o1Str,o2Str;
        o1Str = o1;
        o2Str = o2;
        return o1.compareTo(o2Str);
    }
}
