package homework.map;

import java.io.*;

public class L {


    public static void findLines(String txtPath, String keyword) {
        int size = 0;
        try (BufferedReader inputStream = new BufferedReader(new FileReader(txtPath))) {
            String findLine = "";
            if ((findLine = inputStream.readLine()) != null) {
                if (findLine.contains(keyword)) {
                    System.out.println(findLine);
                    size++;
                } else {
                }
                System.out.println(size);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printSizeOfPackage(String path) {
        File file = new File(path);
        if (file.isDirectory() && file.exists()) {
            File[] files = file.listFiles();
            double size = 0;
            for (File singlfile : files) {
                size = (double) (size + singlfile.length());
            }
            System.out.println("The total size of the package is " + size / (1024 * 1024) + " mb");

        } else {
            System.err.println("I will not find anything");
        }
    }

    public static void createFileWithContent(String path, String filename, String content) throws IOException {
        File file = new File(path);
        if (file.exists()) {
            file.createNewFile();
        } else {
            System.out.println("change the file name");
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        L.findLines("C:\\Users\\User\\Desktop\\sample.txt", "as");
        L.printSizeOfPackage("C:\\Users\\User\\Desktop\\java");
        L.createFileWithContent("C:\\Users\\User\\Desktop\\java\\java1\\git\\edge\\1111.txt","\\1111.txt","java,lava");
    }
}