class Solution {
    public int findKthLargest(int[] nums, int k) {
        // brute force
        // converted int array into Integer wrapper class 
        Integer[] arr = new Integer[nums.length];
        // traverse and stored
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        // reverse order
        Arrays.sort(arr, Collections.reverseOrder());
        // kth value
        return arr[k - 1];
    }
}