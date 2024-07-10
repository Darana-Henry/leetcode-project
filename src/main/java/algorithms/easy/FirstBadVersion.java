//https://leetcode.com/problems/first-bad-version/description/
package algorithms.easy;

public class FirstBadVersion {
    public static void main(String[] args) {
        FirstBadVersion badVersion = new FirstBadVersion();
        System.out.println("Output:\t" + badVersion.firstBadVersionBruteForce(5));
        System.out.println("Output:\t" + badVersion.firstBadVersionOptimized(1));
    }

    public int firstBadVersionBruteForce(int n) {
        int low = 0;
        int high = n;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid))
                high = mid;
            else
                low = mid + 1;
        }

        if (low == high && isBadVersion(low))
            return low;

        return -1;
    }

    public int firstBadVersionOptimized(int n) {
        int f = 1, l = n;
        while (f <= l) {
            int m = f + (l - f) / 2;
            if (!isBadVersion(m)) {
                f = m + 1;
            } else {
                l = m - 1;
            }
        }
        return f;
    }

    public boolean isBadVersion(int version) {
        return false;
    }
}

