class Solution {
    public boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    //max non-overlapping palindromic pieces (length >= k) from s[i..j]
    public int solve(String s, int k, int i, int j, int[][] t) {
        int n = s.length();
        if (i >= n || j >= n)
            return 0;

        if (t[i][j] != -1)
            return t[i][j];

        if (isPalindrome(s, i, j)) {
            int growWindow  = solve(s, k, i, j + 1, t);
            int takeIt      = 1 + solve(s, k, j + 1, j + k, t);
            int slideWindow = solve(s, k, i + 1, j + 1, t);

            return t[i][j] = Math.max(growWindow, Math.max(takeIt, slideWindow));
        }

        int slideWindow = solve(s, k, i + 1, j + 1, t);
        int growWindow  = solve(s, k, i, j + 1, t);

        return t[i][j] = Math.max(slideWindow, growWindow);
    }

    public int maxPalindromes(String s, int k) {
        int n = s.length();
        if (k == 1)
            return n; //each character can be a substring

        int[][] t = new int[n][n];
        for (int[] row : t) Arrays.fill(row, -1);

        return solve(s, k, 0, k - 1, t);
    }
}
