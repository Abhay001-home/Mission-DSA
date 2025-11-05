public class merge88 {
     static void merge(int[] nums1, int m, int[] nums2, int n) {
          int ptr1 = m - 1;
          int ptr2 = n - 1;
          int ptr3 = m + n - 1;

          while (ptr1 >= 0 && ptr2 >= 0) {
               if (nums1[ptr1] > nums2[ptr2]) {
                    nums1[ptr3--] = nums1[ptr1--];
               } else {
                    nums1[ptr3--] = nums2[ptr2--];
               }
          }
          while (ptr2 >= 0) {
               nums1[ptr3--] = nums2[ptr2--];
          }
          // No need to handle ptr1 >= 0: remaining elements already in place
     }

     public static void main(String[] args) {
          int[] nums1 = { 1, 2, 3, 0, 0, 0 }; // length = m + n
          int[] nums2 = { 2, 5, 6 };
          int m = 3;
          int n = 3;

          merge(nums1, m, nums2, n);

          // Print result
          for (int num : nums1) {
               System.out.print(num + " ");
          }
     }
}