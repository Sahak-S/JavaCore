package grup1.error;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Error {
    public static void main(String[] args) {

        String str = "";
        String fileName = "C:\\Users\\User\\Desktop\\java\\java1\\git\\edge\\";
        String line = null;
        try {
            java.io.FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch(FileNotFoundException ex) {
            System.out.println("Невозможно открыть файл '" + fileName + "'");
        } catch(IOException ex) {
            System.out.println("Ошибка чтения файла '" + fileName + "'");
        }
        System.out.println(fileName.lastIndexOf(str));
    }
}
