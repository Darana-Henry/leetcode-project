//https://leetcode.com/problems/decode-the-message/
package algorithms.easy.d;

public class DecodeTheMessage {
    public static void main(String[] args) {
        DecodeTheMessage decode = new DecodeTheMessage();
        System.out.println(
                "Output:\t" + decode.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
        System.out.println("Output:\t" + decode.decodeMessage("eljuxhpwnyrdgtqkviszcfmabo",
                "zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
    }

    public String decodeMessage(String key, String message) {
        char[] decoder = new char[128];
        char[] decoded = message.toCharArray();
        decoder[' '] = ' ';

        for (int i = 0, decode = 0; i < key.length(); i++)
            if (decoder[key.charAt(i)] == 0) decoder[key.charAt(i)] = (char) ('a' + decode++);

        for (int i = 0; i < message.length(); i++)
            decoded[i] = decoder[decoded[i]];

        return String.valueOf(decoded);
    }
}
