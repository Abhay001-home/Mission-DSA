public class quesTion26_4 {
     public static void findSubsets(String str,String newStr, int idx){
          if(idx == str.length()){
               if (newStr.length() == 0) {
                    System.out.println("null");
               } else {
                    System.out.println(newStr);                    
               }
               return;
          }
          // if string wants to be a part of a subset then add it and ask for next element
          findSubsets(str, newStr+str.charAt(idx), idx+1);
          // if string does not want to be a part of a subset then leave the element and move to the next element
          findSubsets(str, newStr, idx+1);
     }
     public static void main(String[] args) {
          String str = "abcd";
          findSubsets(str, "", 0);
     }
}
