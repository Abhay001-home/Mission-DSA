import java.util.*;

public class ProductMatrix {
     static final int MOD = 12345;

     // Extended Euclidean Algorithm to find modular inverse
     static int modInverse(int a, int m) {
          int m0 = m, y = 0, x = 1;
          if (m == 1)
               return 0;
          while (a > 1) {
               int q = a / m;
               int t = m;
               m = a % m;
               a = t;
               t = y;
               y = x - q * y;
               x = t;
          }
          if (x < 0)
               x += m0;
          return x;
     }

     public static int[][] productMatrix(int[][] grid) {
          int n = grid.length; 
          int m = grid[0].length;
          int[][] result = new int[n][m];

          // Flatten grid
          List<Integer> values = new ArrayList<>();
          for (int[] row : grid) {
               for (int val : row)
                    values.add(val % MOD);
          }

          // Compute total product modulo MOD
          long totalProduct = 1;
          for (int val : values) {
               totalProduct = (totalProduct * val) % MOD;
          }

          // Compute result matrix
          int idx = 0;
          for (int i = 0; i < n; i++) {
               for (int j = 0; j < m; j++) {
                    int val = grid[i][j] % MOD;
                    if (val != 0 && gcd(val, MOD) == 1) {
                         // Use modular inverse
                         result[i][j] = (int) ((totalProduct * modInverse(val, MOD)) % MOD);
                    } else {
                         // Recompute product excluding this element
                         long prod = 1;
                         for (int k = 0; k < values.size(); k++) {
                              if (k != idx) {
                                   prod = (prod * values.get(k)) % MOD;
                              }
                         }
                         result[i][j] = (int) prod;
                    }
                    idx++;
               }
          }
          return result;
     }

     // GCD helper
     static int gcd(int a, int b) {
          return b == 0 ? a : gcd(b, a % b);
     }

     // Example usage
     public static void main(String[] args) {
          int[][] grid1 = { { 1, 2 }, { 3, 4 } };
          int[][] res1 = productMatrix(grid1);
          System.out.println(Arrays.deepToString(res1)); // [[24, 12], [8, 6]]

          int[][] grid2 = { { 12345 }, { 2 }, { 1 } };
          int[][] res2 = productMatrix(grid2);
          System.out.println(Arrays.deepToString(res2)); // [[2], [0], [0]]
     }
}
