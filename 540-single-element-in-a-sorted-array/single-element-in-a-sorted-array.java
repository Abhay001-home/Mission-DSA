class Solution {
    public int singleNonDuplicate(int[] nums) {
        int size = nums.length;
        // basic case considerations
        if(size == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[size-1] != nums[size-2]) return nums[size-1];

        // binary implementation
        int low = 1, high = size-2;
        int mid;
        
        while(low <= high){
            mid = (low + high)/2;
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){
                return nums[mid];
            }
            // eliminated left half
            if((mid % 2 == 1 && nums[mid-1] == nums[mid]) || (mid % 2 == 0 && nums[mid] == nums[mid+1])){
                low = mid + 1;
            }
            
            // eliminated right half
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}