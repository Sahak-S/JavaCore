package homework.map;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class F {
    public static void main(String[] args) throws FileNotFoundException {
        int count = 0;
        String phat = "C:\\Users\\User\\java_error_in_idea64_10760.log";
        File files = new File(phat);
        Scanner scanner = new Scanner(files);
        String line = scanner.nextLine();
        for (int i = 0; i < line.length(); i++) {
            System.out.println(line);
            count++;

        }
        scanner.close();

    }
}
