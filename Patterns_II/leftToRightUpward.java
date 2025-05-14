import java.util.Scanner;
public class Pattern_II{
        public static void leftToRightUpward(int row, int col){
          // outer loop for rows
          for(int i=1;i<=row;i++){
               // inner loop for columns
               for(int j=1;j<=col;j++){
                    // condition for first and last row or first and last column
                    if(i<j){
                         System.out.print(" ");
                    }else{
                         System.out.print("*");
                    }
               }
               System.out.println();
          }
     }
public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        leftToRightUpward(a,b);
        sc.close();
	}
}

Author: Abhay Kumar Verma
