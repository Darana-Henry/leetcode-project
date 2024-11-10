//https://leetcode.com/problems/determine-color-of-a-chessboard-square/
package algorithms.easy.d;

public class DetermineColorOfAChessboardSquare {
    public static void main(String[] args) {
        DetermineColorOfAChessboardSquare chess = new DetermineColorOfAChessboardSquare();
        System.out.println("Output:\t" + chess.squareIsWhite("a1"));
        System.out.println("Output:\t" + chess.squareIsWhite("h3"));
        System.out.println("Output:\t" + chess.squareIsWhite("c7"));
    }

    public boolean squareIsWhite(String coordinates) {
        return (coordinates.charAt(0) + coordinates.charAt(1)) % 2 == 1;
    }
}
