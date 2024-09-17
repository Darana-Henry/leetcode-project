//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
package algorithms.easy;

public class FinalValueOfVariableAfterPerformingOperations {
    public static void main(String[] args) {
        FinalValueOfVariableAfterPerformingOperations value = new FinalValueOfVariableAfterPerformingOperations();
        System.out.println("Output:\t" + value.finalValueAfterOperations(new String[]{"--X", "X++", "X++"}));
        System.out.println("Output:\t" + value.finalValueAfterOperations(new String[]{"++X", "++X", "X++"}));
        System.out.println("Output:\t" + value.finalValueAfterOperations(new String[]{"X++", "++X", "--X", "X--"}));
        System.out.println("Output:\t" + value.finalValueAfterOperationsOptimized(new String[]{"--X", "X++", "X++"}));
        System.out.println("Output:\t" + value.finalValueAfterOperationsOptimized(new String[]{"++X", "++X", "X++"}));
        System.out.println(
                "Output:\t" + value.finalValueAfterOperationsOptimized(new String[]{"X++", "++X", "--X", "X--"}));
    }

    public int finalValueAfterOperations(String[] operations) {
        int answer = 0;
        for (String op : operations) {
            if (op.equals("X++") || op.equals("++X")) answer++;
            if (op.equals("X--") || op.equals("--X")) answer--;
        }
        return answer;
    }

    public int finalValueAfterOperationsOptimized(String[] operations) {
        int answer = 0;
        for (String op : operations)
            answer += (44 - op.charAt(1));
        return answer;
    }
}
