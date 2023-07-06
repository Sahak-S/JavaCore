package tread;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Tread {

    public static void main(String[] args) throws IOException {

        String file = "C:\\Users\\User\\Desktop\\sample.txt";
        getWordCount(file);

    }

    private static void getWordCount(String filename) throws IOException {
        System.out.println(System.currentTimeMillis());
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        String a = "as";
        int words = 0;
        int lines = 0;
        while (scanner.hasNextLine()) {
            lines++;
            String[] array = scanner.nextLine().split(" ");
              words = words + array.length;

        }

        System.out.println("number of words :" + words);
        System.out.println("number of lines :" + lines);
        System.out.println(System.currentTimeMillis());
    }
}