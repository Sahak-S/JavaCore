package javadas.homework.map;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class E {

    public static void main(String[] args) {
        List<File> fileList = new ArrayList<>();
        serchFiles(new File("D:\\"),fileList);
        for (File file : fileList) {
            System.out.println(file.getAbsolutePath());
        }
    }

    private static void serchFiles(File rootFile, List<File> fileList) {
        if (rootFile.isDirectory()){
            System.out.println(rootFile.getAbsolutePath());
            File[] direktoryFile = rootFile.listFiles();
            if (direktoryFile != null){
                for (File file : direktoryFile) {
                    if (file.isDirectory()){
                        serchFiles(file,fileList);
                    }else if (file.getName().toLowerCase().endsWith(".Dat")){
                        fileList.add(file);
                    }
                }
            }
        }
    }
}
