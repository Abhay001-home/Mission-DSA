public class searchInRotatedSortedArray{
     public static int searchInArray(int arr[],int si,int ei,int target) {
          if(si > ei ){
               return -1;
          }
          int mid = si + (ei -si)/2;
          if(arr[mid] == target){
               return mid;
          }
          // line1 rotated element ke pehle vali values
          if(arr[si] <= arr[mid]){
               if (arr[si] <= target && target <= arr[mid]) {
                    return searchInArray(arr, si, mid, target);
               } else {
                    return searchInArray(arr, mid+1, ei, target);
               }
          }
          //  line2 rotated element ke baad vali values
          else {
               if (arr[mid] <= target && target <= arr[ei]) {
                    return searchInArray(arr, mid+1, ei, target);
               } else {
                    return searchInArray(arr, si, mid-1, target);
               }
          }
     }
     public static void main(String[] args) {
          int arr[] = {11,13,23,32,45,56,67,78,89};
          int target = 45;
          int targetIdx = searchInArray(arr,0,arr.length-1,target);
          System.out.println("Target index is: "+targetIdx);
     }
}