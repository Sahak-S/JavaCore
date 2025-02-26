package javadas.inputOutputOperator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

    public static void main(String[] args) {

        FileInputStream fin = null;
        FileOutputStream fout = null;
        // сначала убедиться, что указаны имена обоих файлов
        if (args.length != 2) {
            System.out.println("Использование: CopyFile откуда куда");
            return;
        }
        // копировать файл
        try {
            // попытаться открыть файлы
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            int i;
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException е) {
            System.out.println("Oшибкa ввода-вывода: " + е);
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException е2) {
                System.out.println("Oшибкa закрытия файла ввода");
                try {
                    if (fout != null){
                        fout.close();
                    }
                } catch (IOException e2) {
                    System.out.println("Oшибкa закрытия файла вывода");
                }
            }
        }
    }
}