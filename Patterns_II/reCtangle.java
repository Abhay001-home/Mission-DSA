import java.util.Scanner;

public class reCtangle {
     public static void hollow_rectangle(int row, int col) {
          // outer loop for rows
          for (int i = 1; i <= row; i++) {
               // inner loop for columns
               for (int j = 1; j <= col; j++) {
                    // condition for first and last row or first and last column
                    if (i == 1 || i == row || j == 1 || j == col) {
                         System.out.print("* ");
                    } else {
                         System.out.print("  ");
                    }
               }
               System.out.println();
          }
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of rows and columns for hollow rectangle: ");
          int a = sc.nextInt();
          int b = sc.nextInt();
          hollow_rectangle(a, b);
          sc.close();
     }
}

// Author: Abhay Kumar Verma (Cybersecurity)
