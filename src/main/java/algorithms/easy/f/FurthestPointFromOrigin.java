//https://leetcode.com/problems/furthest-point-from-origin/
package algorithms.easy.f;

public class FurthestPointFromOrigin {
    public static void main(String[] args) {
        FurthestPointFromOrigin furthest = new FurthestPointFromOrigin();
        System.out.println("Output:\t" + furthest.furthestDistanceFromOrigin("L_RL__R"));
        System.out.println("Output:\t" + furthest.furthestDistanceFromOrigin("_R__LL_"));
        System.out.println("Output:\t" + furthest.furthestDistanceFromOrigin("_______"));
    }

    public int furthestDistanceFromOrigin(String moves) {
        int xAxis = Math.abs(count(moves, 'L') - count(moves, 'R'));
        return xAxis + count(moves, '_');
    }

    public int count(String moves, char ch) {
        int distance = 0;
        for (int i = 0; i < moves.length(); i++)
            if (moves.charAt(i) == ch) distance++;
        return distance;
    }
}
