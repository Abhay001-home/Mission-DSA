class Solution {
    public boolean uniformArray(int[] nums1) {
        int oddCount = 0;
        
        for (int num : nums1) {
            if (num % 2 != 0) {
                oddCount++;
            }
        }
        
        int n = nums1.length;
        
        boolean canMakeAllOdd = (oddCount > 0);
        boolean canMakeAllEven = (oddCount != 1);
        
        return canMakeAllOdd || canMakeAllEven;
    }
}