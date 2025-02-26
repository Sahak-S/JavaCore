package javadas.homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MultiReade {
    public static String path = "C:\\Users\\User\\Desktop\\sample.txt";
    public static AtomicInteger countOfKeyword = new AtomicInteger();

    public static void main(String[] args) throws IOException, InterruptedException {
        long count = Files.lines(Paths.get(path)).count();
        List<String> lines = Files.readAllLines(Paths.get(path));
        System.out.println("all lines  " + lines.size());
        long currentTime = System.currentTimeMillis();

        FileReader thread1 = new FileReader("thread1",lines.subList(0,500000),";");
        FileReader thread2 = new FileReader("thread2",lines.subList(50001,1000000),";");
        FileReader thread3 = new FileReader("thread3",lines.subList(1000001,2000000),";");
        FileReader thread4 = new FileReader("thread4",lines.subList(2000001,3000000),";");
        FileReader thread5 = new FileReader("thread5",lines.subList(3000001,lines.size()),";");

        thread1.t.join();
        thread2.t.join();
        thread3.t.join();
        thread4.t.join();
        thread5.t.join();

        System.out.println("found lines :" + countOfKeyword);
        long finishTime = System.currentTimeMillis();
        System.out.println("time: " + (finishTime - currentTime));

    }

    static class FileReader implements Runnable {
        Thread t;
        private List<String> lines;
        private String keyword;

        public FileReader(String threadName,List<String> lines,String keyword){
            this.lines = lines;
            this.keyword = keyword;
            t = new Thread(this,threadName);
            t.start();
        }

        @Override

        public void run() {
            for (String line : lines) {
                if (line.contains(keyword)){
                    countOfKeyword.incrementAndGet();
                }
                
            }
        }
    }


}
