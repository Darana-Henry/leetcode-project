//https://leetcode.com/problems/optimal-partition-of-string/
package algorithms.medium.o;

import java.util.HashSet;
import java.util.Set;

public class OptimalPartitionOfString {
    public static void main(String[] args) {
        OptimalPartitionOfString obj = new OptimalPartitionOfString();
        System.out.println("Output:\t" + obj.partitionString("abacaba"));
        System.out.println("Output:\t" + obj.partitionString("ssssss"));
        System.out.println("Output:\t" + obj.partitionStringBitMasking("abacaba"));
        System.out.println("Output:\t" + obj.partitionStringBitMasking("ssssss"));
    }

    public int partitionString(String s) {
        int answer = 1;
        Set<Character> set = new HashSet<>();

        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                answer++;
                set.clear();
            }
            set.add(ch);
        }
        return answer;
    }


    public int partitionStringBitMasking(String s) {
        int answer = 1;
        int bitmask = 0;

        for (char ch : s.toCharArray()) {
            int num = ch - 'a';

            if (((bitmask >> num) & 1) == 1) {
                bitmask = 0;
                answer++;
            }
            bitmask |= (1 << num);
        }

        return answer;
    }
}
