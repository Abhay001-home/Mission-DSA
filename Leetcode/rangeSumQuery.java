public class rangeSumQuery {
     private int[] prefixSum;
     public rangeSumQuery(int[] nums) {
          int length = nums.length;
// for doing computation
          prefixSum = new int[length + 1];
          for (int i = 0; i < length; i++) {
               prefixSum[i + 1] = prefixSum[i] + nums[i];
          }
     }
// count upto specified index
     public int sumRange(int left, int right) {
          return prefixSum[right + 1] - prefixSum[left];
     }

     public static void main(String[] args) {
          // Test Case 1
          int[] nums1 = { -2, 0, 3, -5, 2, -1 };
          rangeSumQuery obj1 = new rangeSumQuery(nums1);
          System.out.println(obj1.sumRange(0, 2)); // Output: 1
          System.out.println(obj1.sumRange(2, 5)); // Output: -1
          System.out.println(obj1.sumRange(0, 5)); // Output: -3

          // Test Case 2
          // int[] nums2 = { 1, 2, 3, 4 };
          // rangeSumQuery obj2 = new rangeSumQuery(nums2);
          // System.out.println(obj2.sumRange(1, 3)); // Output: 9
          // System.out.println(obj2.sumRange(0, 1)); // Output: 3
     }
}
