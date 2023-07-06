package tread;

import java.io.*;

public class Test {

    public static void file (String txtPath, String keyword) throws IOException {
        int size = 0;
        //String line32 = Files.readAllLines(Paths.get("C:\\Users\\User\\Desktop\\sample.txt")).get(32);
        try (BufferedReader inputStream = new BufferedReader(new FileReader(txtPath))) {
            String findLine = "";
            while ((findLine = inputStream.readLine()) != null) {
                if (findLine.contains(keyword)) {
                  //  System.out.println(findLine);
                    size++;
                }else {
                }
            }
            System.out.println("lines where there is such a word "+size);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

