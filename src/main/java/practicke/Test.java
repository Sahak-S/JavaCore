package practicke;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test {

    // public static AtomicInteger countOfKeyword = new AtomicInteger();
    public static void main(String[] args) throws IOException {

        String file = "C:\\Users\\User\\Desktop\\sample.txt";
        getWordCount(file);

    }

    private static void getWordCount(String filename) throws IOException {

        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        int words = 0;
        int lines = 0;
        long currentTime = System.currentTimeMillis();
        while (scanner.hasNextLine()) {
            lines++;
            String[] array = scanner.nextLine().split(" ");
            words = words + array.length;

        }
//        long currentTime = System.currentTimeMillis();
//        long finishTime = System.currentTimeMillis();
        System.out.println("number of words :" + words);
        System.out.println("number of lines :" + lines);
        long finishTime = System.currentTimeMillis();
        System.out.println("time: " + (finishTime - currentTime));

//        System.out.println("time: " + (finishTime - currentTime));
//        scanner.close();
    }
}
