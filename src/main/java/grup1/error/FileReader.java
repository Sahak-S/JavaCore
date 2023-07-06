package grup1.error;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\User\\Desktop\\java\\Новая папка\\Новая папка1\\Новая папка2\\captmidn.txt");
        Scanner scanner = new Scanner(file);
        String fileContackt = "This is new file hhh,454";
        while (scanner.hasNextLine()){
            fileContackt = fileContackt.concat(scanner.nextLine() + " \n");
        }

        FileWriter writer = new FileWriter("C:\\Users\\User\\Desktop\\java\\Новая папка\\Новая папка1\\Новая папка2\\newfile.txt");
        writer.write(fileContackt);
        writer.close();
    }
}
