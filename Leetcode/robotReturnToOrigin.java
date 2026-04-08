public class robotReturnToOrigin {
     public static boolean judgeCircle(String moves) {
          int n = moves.length();
          int posX = 0, posY = 0;
          for (int i = 0; i < n; i++) {
               char ch = moves.charAt(i);

               if (ch == 'U')
                    posY++;
               else if (ch == 'D')
                    posY--;
               else if (ch == 'L')
                    posX--;
               else if (ch == 'R')
                    posX++;
          }
          return posX == 0 && posY == 0;
     }

     public static void main(String[] args) {
          String moves = "UD";
          System.out.println(judgeCircle(moves));
     }
}
