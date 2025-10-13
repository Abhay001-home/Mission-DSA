public class mergeAndSort {
     public static void printArr(int arr[]) {
          for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i] + " ");
          }
     }

     public static void mergeSort(int arr[], int si, int ei) {
          if (si >= ei) {
               return;
          }
          int mid = si + (ei - si) / 2;
          mergeSort(arr, si, mid); // Left half
          mergeSort(arr, mid + 1, ei); // Right half
          merge(arr, si, mid, ei); // Merge the two halves
     }

     public static void merge(int arr[], int si, int mid, int ei) {
          int i = si; // Starting index for left subarray
          int j = mid + 1; // Starting index for right subarray
          int k = 0; // Starting index for temporary array
          int[] temp = new int[ei - si + 1]; // Temporary array to hold merged result

          // Merging the two subarrays into temp
          while (i <= mid && j <= ei) {
               if (arr[i] <= arr[j]) {
                    temp[k++] = arr[i++];
               } else {
                    temp[k++] = arr[j++];
               }
          }

          // If any elements are left in the left subarray
          while (i <= mid) {
               temp[k++] = arr[i++];
          }

          // If any elements are left in the right subarray
          while (j <= ei) {
               temp[k++] = arr[j++];
          }

          // Copy the elements from temp back into arr
          for (k = 0; k < temp.length; k++) {
               arr[si + k] = temp[k];
          }
     }

     public static void main(String[] args) {
          int arr[] = { 9, 5, 2, 3, 4, 1, 6 };
          mergeSort(arr, 0, arr.length - 1);
          printArr(arr); // Expected Output: 1 2 3 4 5 6 9
     }
}
 