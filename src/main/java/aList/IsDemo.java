package aList;

import org.omg.IOP.TAG_RMI_CUSTOM_MAX_STREAM_FORMAT;

public class IsDemo {


    public static void main(String[] args) {


        char[] chars = {'a', 'b', '5', '?', 'A', ' '};

        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                System.out.println(chars[i] + " tiv");
            }

            if (Character.isLetter(chars[i])) {
                System.out.println(chars[i] + " tar");
            }

            if (Character.isWhitespace(chars[i])) {
                System.out.println(chars[i] + " bacat");
            }

            if (Character.isUpperCase(chars[i])) {
                System.out.println(chars[i] + " mecatar");
            }

            if (Character.isLowerCase(chars[i])) {
                System.out.println(chars[i] + " hajord tar");
            }

        }
    }
}