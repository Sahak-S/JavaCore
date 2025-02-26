package javadas.homework.fileExample;

import java.io.IOException;

public class FileUtilTest {

    public static void main(String[] args) throws IOException {

        FileUtil.findLines("C:\\Users\\User\\Desktop\\sample.txt", "as");
        FileUtil.findLines("C:\\Users\\User\\Desktop\\java\\Новая папка\\Новая папка1\\doc1\\1000.txt", "try");
        FileUtil.printSizeOfPackage("C:\\Users\\User\\Desktop\\java");
        FileUtil.createFileWithContent("C:\\Users\\User\\Desktop\\java\\java1\\git\\edge\\1111.txt", "\\1111.txt", "hello my name is java");


    }

}