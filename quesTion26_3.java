public class quesTion26_3 {
     public static void changeArr(int[] arr, int idx, int val){
          if(idx == arr.length){
               //base case
               printArr(arr);
               return;
          }
          arr[idx] = val; // storing the value for each round of call in call stack
          changeArr(arr, idx+1, val+1); //clling function to update the values
          arr[idx] = arr[idx] - 2; //backtrack krte hue usi same array me values update ho rhi hai
     }
     //print the array
     public static void printArr(int[] arr){
          for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i] + " ");
          }
          System.out.println();
     }
     //driver section
     public static void main(String[] args) {
          int[] arr = new int[5];
          changeArr(arr, 0, 1);
          printArr(arr);
     }
}
