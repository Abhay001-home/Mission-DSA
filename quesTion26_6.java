public class quesTion26_6 {
     static void findPermutation(String str, String result){
          //recursion
          for (int i = 0; i < str.length(); i++) {
               char curr = str.charAt(i);

               String newStr = str.substring(0, i) + str.substring(i+1);
               findPermutation(newStr, result+curr);
          }
          //base case
          if(str.length() == 0){
               System.out.println(result);
               return;
          }
     }
     public static void main(String[] args) {
          String str = "abc";
          findPermutation(str,"");
     }
          //Time Complexity : O(n * n!)
          //Abhay Kumar Verma 
}
