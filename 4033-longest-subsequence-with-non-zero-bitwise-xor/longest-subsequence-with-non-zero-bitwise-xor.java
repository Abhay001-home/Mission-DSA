class Solution {
    public int longestSubsequence(int[] nums) {
        int totalXor = 0;
        // int n = nums.length;
        boolean hasNonZero = false;
        for (int num : nums) {
            totalXor = totalXor ^ num;
            if (num != 0) {
                hasNonZero = true;
            }
        }
        if (totalXor != 0) {
            return nums.length;
        }
        if (hasNonZero) {
            return nums.length - 1;
        }
        return 0;
        //    return n;
    }
}