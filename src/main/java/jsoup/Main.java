package jsoup;

import lombok.var;
import org.jsoup.Jsoup;


public class Main {
    public static void main(String[] args) {

        try {
            var document = Jsoup.connect("https://www.google.com/").get();
            var titleElements = document.select("h3");
        for (var element: titleElements) {
            System.out.println(element.text());
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
