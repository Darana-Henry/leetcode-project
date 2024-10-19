//https://leetcode.com/problems/design-an-ordered-stream/
package algorithms.easy.d;

import java.util.ArrayList;
import java.util.List;

public class DesignAnOrderedStream {
    public static void main(String[] args) {
        OrderedStream os = new OrderedStream(5);
        System.out.println("Output:\t" + os.insert(3, "ccccc")); // Inserts (3, "ccccc"), returns [].
        System.out.println("Output:\t" + os.insert(1, "aaaaa")); // Inserts (1, "aaaaa"), returns ["aaaaa"].
        System.out.println("Output:\t" + os.insert(2, "bbbbb")); // Inserts (2, "bbbbb"), returns ["bbbbb", "ccccc"].
        System.out.println("Output:\t" + os.insert(5, "eeeee")); // Inserts (5, "eeeee"), returns [].
        System.out.println("Output:\t" + os.insert(4, "ddddd")); // Inserts (4, "ddddd"), returns ["ddddd", "eeeee"].
    }
}

class OrderedStream {
    String[] data;
    int pointer;

    public OrderedStream(int n) {
        data = new String[n];
        pointer = 0;
    }

    public List<String> insert(int idKey, String value) {
        data[idKey - 1] = value;
        List<String> answer = new ArrayList<>();
        while (pointer < data.length && data[pointer] != null) answer.add(data[pointer++]);
        return answer;
    }
}