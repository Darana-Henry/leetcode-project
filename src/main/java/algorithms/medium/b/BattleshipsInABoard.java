//https://leetcode.com/problems/battleships-in-a-board/
package algorithms.medium.b;

public class BattleshipsInABoard {
    public static void main(String[] args) {
        BattleshipsInABoard obj = new BattleshipsInABoard();
        System.out.println("Output:\t" + obj.countBattleships(
                new char[][]{{'X', '.', '.', 'X'}, {'.', '.', '.', 'X'}, {'.', '.', '.', 'X'}}));
        System.out.println("Output:\t" + obj.countBattleships(new char[][]{{'.'}}));
    }

    public int countBattleships(char[][] board) {
        int answer = 0, rows = board.length, cols = board[0].length;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (board[row][col] == 'X')
                    if ((row == 0 || board[row - 1][col] == '.') && (col == 0 || board[row][col - 1] == '.')) answer++;
            }
        }

        return answer;
    }
}
