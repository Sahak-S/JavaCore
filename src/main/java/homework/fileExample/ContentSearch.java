package homework.fileExample;

import java.io.*;

import java.util.Scanner;

public class ContentSearch {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("please input path");
        String pathStr = scanner.nextLine();
        //String path = "C:\\Users\\User\\Desktop\\java\\Новая папка\\Новая папка1\\doc1";
        File path = new File(pathStr);
        if (!path.exists() || path.isFile()) {
            System.err.println("path does not exists or is not directory");
        } else {
            System.out.println("pleas input file name");
            String keyword = scanner.nextLine();
            findFile(path, keyword);

        }
    }


    static void findFile(File parent, String keyword) {
        for (File file : parent.listFiles()) {
            if (file.isDirectory()) {
                findFile(file, keyword);
            } else {
                if (file.getName().endsWith(".txt")) {
                    searchKeyword(file, keyword);
                }
            }

        }
    }

    private static void searchKeyword(File file, String keyword) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line = "";
            int lineNumber = 1;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println(file.getAbsolutePath() + " " + lineNumber);
                    break;
                }
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

