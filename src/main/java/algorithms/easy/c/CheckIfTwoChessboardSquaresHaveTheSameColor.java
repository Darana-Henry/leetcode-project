//https://leetcode.com/problems/check-if-two-chessboard-squares-have-the-same-color/
package algorithms.easy.c;

public class CheckIfTwoChessboardSquaresHaveTheSameColor {
    public static void main(String[] args) {
        CheckIfTwoChessboardSquaresHaveTheSameColor chess = new CheckIfTwoChessboardSquaresHaveTheSameColor();
        System.out.println("Output:\t" + chess.checkTwoChessboards("a1", "c3"));
        System.out.println("Output:\t" + chess.checkTwoChessboards("a1", "h3"));
    }

    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        return (coordinate1.charAt(0) + coordinate1.charAt(1)) % 2 == (coordinate2.charAt(0) + coordinate2.charAt(
                1)) % 2;
    }
}
