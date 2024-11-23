//https://leetcode.com/problems/delete-columns-to-make-sorted/
package algorithms.easy.d;

public class DeleteColumnsToMakeSorted {
    public static void main(String[] args) {
        DeleteColumnsToMakeSorted delete = new DeleteColumnsToMakeSorted();
        System.out.println("Output:\t" + delete.minDeletionSize(new String[]{"cba", "daf", "ghi"}));
        System.out.println("Output:\t" + delete.minDeletionSize(new String[]{"a", "b"}));
        System.out.println("Output:\t" + delete.minDeletionSize(new String[]{"zyx", "wvu", "tsr"}));
    }

    public int minDeletionSize(String[] strs) {
        int answer = 0;
        int rows = strs.length;
        int cols = strs[0].length();

        for (int col = 0; col < cols; col++) {
            for (int row = 1; row < rows; row++) {
                if (strs[row].charAt(col) < strs[row - 1].charAt(col)) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}
