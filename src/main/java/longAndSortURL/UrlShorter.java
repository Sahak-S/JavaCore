package longAndSortURL;

import lombok.var;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UrlShorter {
private Map<String,String> linkMap = new HashMap<>();
private String domain ="http://sh.com";

public String shortedUrl(String longUrl){
    String uniqueID = UUID.randomUUID().toString().substring(0,8);
    String shortUrl = domain + uniqueID;
    linkMap.put(shortUrl,longUrl);
    return shortUrl;
}

public String getOriginalUrl(String shortUrl){
    return linkMap.get(shortUrl);
}

    public static void main(String[] args) {
     UrlShorter urlShorter = new UrlShorter();

        var longUrl = "example.com/very/long/url/that/we/need/to/short";
        var shortUrl = urlShorter.shortedUrl(longUrl);
        System.out.println("Short Url: " + shortUrl);

        var originalUrl = urlShorter.getOriginalUrl(shortUrl);
        System.out.println("Original URL: " + originalUrl);
    }
}
