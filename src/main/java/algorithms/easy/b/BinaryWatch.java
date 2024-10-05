//https://leetcode.com/problems/binary-watch/
package algorithms.easy.b;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {
    public static void main(String[] args) {
        BinaryWatch watch = new BinaryWatch();
        System.out.println("Output:\t" + watch.readBinaryWatch(1));
        System.out.println("Output:\t" + watch.readBinaryWatch(9));
        System.out.println("Output:\t" + watch.readBinaryWatch(3));
    }

    public List<String> readBinaryWatch(int turnedOn) {
        List<String> time = new ArrayList<>();
        for (int hour = 0; hour < 12; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                if (Integer.bitCount(hour) + Integer.bitCount(minute) == turnedOn) {
                    if (minute < 10)
                        time.add(String.format("%d:0%d", hour, minute));
                    else
                        time.add(String.format("%d:%d", hour, minute));
                }
            }
        }
        return time;
    }
}
