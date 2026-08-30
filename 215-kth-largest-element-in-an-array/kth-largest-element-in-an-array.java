class Solution {
    public int findKthLargest(int[] nums, int k) {
        int[] freq = new int[20001];
        for (int i : nums) {
            freq[i + 10000]++;
        }
        for (int i = 20000; i >= 0; i--) {
            if (freq[i] > 0) {
                k -= freq[i];
                if (k <= 0) {
                    return i - 10000;
                }
            }
        }
        return 0;
    }
}