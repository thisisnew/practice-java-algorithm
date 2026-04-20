package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Codec {

    private static final String TINY_URL = "http://tinyurl.com/";
    private int id = 0;
    private final Map<Integer, String> map = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String result = TINY_URL + id;
        map.put(id++, longUrl);
        return result;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int id = Integer.parseInt(shortUrl.replace(TINY_URL, ""));
        return map.get(id);
    }

}
