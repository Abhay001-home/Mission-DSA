class Solution {
    public int findPeakElement(int[] nums) {
        int size = nums.length;
        for(int i=0; i<size; i++){
            if( (i==0 || nums[i-1] < nums[i]) && (i==size-1 || nums[i] > nums[i+1])){
                return i;
            }
        }
        return -1;
    }
}