package javadas.homework.fileExample;

import java.io.*;

public class FileUtil {


    public static void findLines(String txtPath, String keyword) {
       int size = 0;
        try (BufferedReader inputStream = new BufferedReader(new FileReader(txtPath))) {
            String findLine = "";
            while ((findLine = inputStream.readLine()) != null) {
                if (findLine.contains(keyword)) {
                    System.out.println(findLine);
                    size++;
                }else {
                }
            }
            System.out.println(size);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void printSizeOfPackage(String path) {

        File file = new File(path);
        if (file.isDirectory() && file.exists()) {
            File[] files = file.listFiles();
            double size = 0;
            for (File singleFile : files) {
                size = (double) (size + singleFile.length());
            }
            System.out.println("The total size of the package is " + size/(1024*1024) + " mb");

        } else {
            System.err.println("I will not find anything");
        }

    }

    public static void createFileWithContent(String path, String filename, String content) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }else {
            System.out.println("change the file name");
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}