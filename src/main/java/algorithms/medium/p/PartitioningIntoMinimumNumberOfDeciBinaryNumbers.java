//https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
package algorithms.medium.p;


public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public static void main(String[] args) {
        PartitioningIntoMinimumNumberOfDeciBinaryNumbers obj = new PartitioningIntoMinimumNumberOfDeciBinaryNumbers();
        System.out.println("Output:\t" + obj.minPartitions("32"));
        System.out.println("Output:\t" + obj.minPartitions("82734"));
        System.out.println("Output:\t" + obj.minPartitions("27346209830709182346"));
    }

    public int minPartitions(String n) {
        int answer = 0;

        for (int i = 0; i < n.length(); i++) {
            int num = n.charAt(i) - '0';
            answer = Math.max(answer, num);
            if (num == 9) break;
        }

        return answer;
    }
}
