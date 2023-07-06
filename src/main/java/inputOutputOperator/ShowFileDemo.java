package inputOutputOperator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFileDemo {

    public static void main(String[] args) {

        int i;
        FileInputStream fin = null;

        // сначала убедиться, что имя файла указано
        if (args.length != 1) {
            System.out.println("Использование: ShowFile 1100.txt");
            return;
        }
        // Попытка открыть файл
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException е) {
            System.out.println("Heвoзмoжнo открыть файл");
            return;
        }

        //Теперь файл открыт и готов к чтению.
        // Далее из него читаются символы до тех пор,
        // пока не встретится признак конца файла
        try {
            fin = new FileInputStream(args[0]);
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (FileNotFoundException е) {
            System.out.println("Файл не найден");
        } catch (IOException е) {
            System.out.println("Пpoизoшлa ошибка ввода-вывода");
        } finally {
            // закрыть файл в любом случае
            try {
                if(fin != null) fin.close();
            } catch (IOException е) {
                System.out.println("Oшибкa закрытия файла");
            }
        }

    }
}