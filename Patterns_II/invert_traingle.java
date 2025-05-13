import java.util.Scanner;
public class Patterns_II {
public static void invert_triangle(int row, int col){
          // outer loop for rows
          for(int i=1;i<=row;i++){
               // inner loop for columns
               for(int j=1;j<=col;j++){
                    // condition for first and last row or first and last column
                         if((i+j)<=row){    // for 10 rows and 10 columns
                         System.out.print(" ");
                    }else{
                         System.out.print("*");//add space the right of asterisk to get a pyramid shape
                    }
               }
               System.out.println();
          }
     }
public static void main(String[] args){
          Scanner sc =new Scanner(System.in);
          System.out.println("Enter the number of rows and columns for hollow rectangle: ");
          int a = sc.nextInt();
          int b = sc.nextInt();

          invert_triangle(a, b);
          sc.close();
     }
}
