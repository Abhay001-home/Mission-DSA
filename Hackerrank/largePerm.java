import java.io.*;
import java.util.*;
public class largePerm {
     private static int[] largestPermutation(int k, int[] arr) {
          int n = arr.length;
          // pos[value] = current index of this value
          Map<Integer, Integer> pos = new HashMap<>();
          for (int i = 0; i < n; ++i)
               pos.put(arr[i], i);

          for (int i = 0; i < n && k > 0; ++i) {
               int wanted = n - i; // maximal possible number here
               if (arr[i] == wanted)
                    continue; // already optimal
               // swap arr[i] with arr[pos.get(wanted)]
               int p = pos.get(wanted);
               int temp = arr[i];
               arr[i] = arr[p];
               arr[p] = temp;
               // update position map
               pos.put(arr[i], i);
               pos.put(arr[p], p);
               k--;
          }
          return arr;
     }
     public static void main(String[] args) throws IOException {
          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();
               int k = sc.nextInt();
               int[] arr = new int[n];
               for (int i = 0; i < n; ++i)
                    arr[i] = sc.nextInt();

               int[] result = largestPermutation(k, arr);

               StringBuilder out = new StringBuilder();
               for (int i = 0; i < n; ++i) {
                    if (i > 0)
                         out.append(' ');
                    out.append(result[i]);
               }
               System.out.println(out);
          }
     }
}