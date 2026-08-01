import java.util.Arrays;

class Solution {
    Integer[][] arr;
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        arr = new Integer[n][n];
        
        // If player 1's max score difference >= 0, player 1 wins or ties
        return solve(nums, 0, n - 1) >= 0;
    }

    private int solve(int[] nums, int l, int r) {
        // Base case
        if (l == r) {
            return nums[l];
        }

        // Check memoization table
        if (arr[l][r] != null) {
            return arr[l][r];
        }

        // pick left element, subtract what the opponent can achieve next
        int takeLeft = nums[l] - solve(nums, l + 1, r);

        // pick right element, subtract what the opponent can achieve next
        int takeRight = nums[r] - solve(nums, l, r - 1);

        // Store and return the maximum
        arr[l][r] = Math.max(takeLeft, takeRight);
        return arr[l][r];
    }
}