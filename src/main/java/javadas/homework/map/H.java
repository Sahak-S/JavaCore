package javadas.homework.map;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class H {

    public static void main(String[] args) throws FileNotFoundException {
        int count = 0;
        String phat = "C:\\Users\\User\\Desktop\\99999.txt";
        File file = new File(phat);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());

        }
    }
}
