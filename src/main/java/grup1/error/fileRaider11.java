package grup1.error;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileRaider11 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\User\\Desktop\\java\\Новая папка\\Новая папка1\\Новая папка2\\captmidn.txt");
        Scanner scanner = new Scanner(file);
      //  String fileContackt = "This is new file hhh";
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());

        }

    }
}
