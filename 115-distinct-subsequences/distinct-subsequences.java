import java.util.Arrays;

class Solution {
    private long soln(String s, String t, int m, int n, long[][] dp) {
        if (n == 0) {
            return 1;
        }
        if (m == 0) {
            return 0;
        }

        if (dp[m][n] != -1) {
            return dp[m][n];
        }

        if (s.charAt(m - 1) == t.charAt(n - 1)) {
            return dp[m][n] = soln(s, t, m - 1, n - 1, dp) + soln(s, t, m - 1, n, dp);
        } else {
            return dp[m][n] = soln(s, t, m - 1, n, dp);
        }
    }

    public int numDistinct(String s, String t) {
        int m = s.length();
        int n = t.length();
        
        long[][] dp = new long[m + 1][n + 1];
        for (long[] row : dp) {
            Arrays.fill(row, -1);
        }

        return (int) soln(s, t, m, n, dp);
    }
}