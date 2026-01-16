// import java.util.Scanner;
public class quesTion26_8 {
     // THIS IS THE CLASSICAL PROBLEM OF N-QUEENS
     // place N-QUEENS on an nxn chessboard such that NO 2 QUEENS can ATTACK each other

     public static boolean isSafe(char board[][], int row, int col){
          // vertically upwards movement
          for (int i = row-1; i >= 0; i--) {
               if (board[i][col] == 'Q') {
                    return false;
               }
          }
          // diagonally up left side movement
          for (int i= row-1, j = col-1; i>=0 && j>=0; i--,j--) {
               if (board[i][j] == 'Q'){
                    return false;
               }
          }
          // diagonally up right side movement
          for (int i = row-1, j = col+1; i >= 0 && j < board.length; i--,j++) {
               if(board[i][j] == 'Q'){
                    return false;
               }
          }
          return true;
     }

     public static void nQueens(char board[][], int row) {
          // base case
          if (row == board.length) {
               printBoard(board);
               return;
          }
          for (int j = 0; j < board.length; j++) {
               if(isSafe(board,row,j)){
                    board[row][j] = 'Q'; // assigning queen if possible
                    nQueens(board, row + 1);// Backtracking
                    board[row][j] = 'x'; // removing queen if not possible
               }
          }
     }

     // public static void nQueens(char board[][],int row){
     //      // base case
     //      if(row == board.length){
     //           printBoard(board);
     //           return;
     //      }
     //      for (int j = 0; j < board.length; j++) {
     //           board[row][j] = 'Q'; //assigning queen if possible
     //           nQueens(board, row+1);//Backtracking
     //           board[row][j] = 'x';  //removing queen if not possible             
     //      }
     // }

     public static void printBoard(char board[][]){
          System.out.println("______Chess | Board_________");
          for (int i = 0; i < board.length; i++) {
               for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j] + " ");
               }
          System.out.println();
          }
     }
     public static void main(String[] args) {
          // Scanner n = new Scanner(System.in);
          int n = 5;
          char board[][] = new char[n][n];
          for(int i = 0; i < n; i++){
               for (int j = 0; j < n; j++) {
                    board[i][j] = 'x';
               }
          }
          nQueens(board,0);
          isSafe(board, 0, 0);
          // n.close();
     }
     
}