//https://leetcode.com/problems/encode-and-decode-tinyurl/
package algorithms.medium.e;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeTinyURL {
    public static void main(String[] args) {
        Codec obj = new Codec();
        String url = "https://leetcode.com/problems/design-tinyurl";
        String tiny = obj.encode(url);
        System.out.println("Output:\t" + tiny);
        System.out.println("Output:\t" + obj.decode(tiny));
    }
}

class Codec {
    List<String> list = new ArrayList<>();
    int num = 0;

    public String encode(String longUrl) {
        list.add(longUrl);
        return "" + num++;
    }


    public String decode(String shortUrl) {
        return list.get(Integer.parseInt(shortUrl));
    }
}