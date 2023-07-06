package homework.map;

import java.util.*;

abstract class N {
    private static int getHalf(int i) {
        return i / 2;
    }

    public static void main(String[] str) {
        int half = getHalf(0);
        System.out.println("Result is:" + half);


        String s1 = "str";
        String s2 = "str";
        System.out.println("Result: " + s1 == s2);


    }
}
