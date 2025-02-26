package javadas.homework.map;

import java.io.File;
import java.util.Scanner;

public class J {


     static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("pleas input file phat");
        String pathStr = scanner.nextLine();
        //String path = "C:\\Users\\User\\Desktop\\java\\Новая папка\\Новая папка1\\doc1";

        File phat = new File(pathStr);
        if (!phat.exists() || phat.isFile()){
            System.err.println("path does not exists or is not directory");
        }else {
            System.out.println("pleas input file name");
            String fileName = scanner.nextLine();
            findFile(phat,fileName);
        }
    }

    static void findFile(File parent, String fileName) {

        for (File file : parent.listFiles()) {
            if (file.isDirectory()){
                findFile(file,fileName);
            }else {
                if (file.getName().contains(fileName)){
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
