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
          findSubsets(str, newStr+str.charAt(idx), idx+1);
          findSubsets(str, newStr, idx+1);
     }
     public static void main(String[] args) {
          String str = "abc";
          findSubsets(str, "", 0);
     }
}
