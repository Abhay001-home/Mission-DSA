class Solution {
    public int firstStableIndex(int[] nums, int k) {
int n = nums.length;
        
        //compute maximums
        int[] prefixMax = new int[n];
        prefixMax[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], nums[i]);
        }
        
        //compute minimums
        int[] suffixMin = new int[n];
        suffixMin[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], nums[i]);
        }
        
        // instability
        for (int i = 0; i < n; i++) {
            int instabilityScore = prefixMax[i] - suffixMin[i];
            if (instabilityScore <= k) {
                return i;
            }
        }
        
        return -1; // No stable index found
    }
}