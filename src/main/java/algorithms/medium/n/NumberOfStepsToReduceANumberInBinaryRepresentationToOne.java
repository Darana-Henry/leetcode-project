//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/
package algorithms.medium.n;

public class NumberOfStepsToReduceANumberInBinaryRepresentationToOne {
    public static void main(String[] args) {
        NumberOfStepsToReduceANumberInBinaryRepresentationToOne obj = new NumberOfStepsToReduceANumberInBinaryRepresentationToOne();
        System.out.println("Output:\t" + obj.numSteps("1101"));
        System.out.println("Output:\t" + obj.numSteps("10"));
        System.out.println("Output:\t" + obj.numSteps("1"));
    }

    public int numSteps(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(s);

        while (sb.length() > 1) {
            int n = sb.length();

            if (sb.charAt(n - 1) == '0')
                byTwo(sb);
            else
                addOne(sb);
            answer++;
        }

        return answer;
    }

    public void byTwo(StringBuilder s) {
        s.deleteCharAt(s.length() - 1);
    }

    public void addOne(StringBuilder s) {
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) != '0') {
            s.setCharAt(i, '0');
            i--;
        }

        if (i < 0)
            s.insert(0, '1');
        else
            s.setCharAt(i, '1');
    }}
