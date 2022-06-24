import java.util.*;

public class MediandTwoSortedArrays {
      public static double findMedianSortedArrays(int[] A, int[] B) {
            int n = A.length, m = B.length;
            int[] ans = new int[n + m];
            int i = 0, j = 0, k = 0;
            while (i < n && j < m) {
                  if (A[i] < B[j])
                        ans[k++] = A[i++];
                  else
                        ans[k++] = B[j++];
            }
            while (j < m)
                  ans[k++] = B[j++];

            while (i < n)
                  ans[k++] = A[i++];

            int len = n + m;
            if (len % 2 == 0) {
                  int sum = (ans[len / 2] + ans[(len / 2) - 1]);
                  return sum * 1.0 / 2.0;
            } else
                  return ans[len / 2] * 1.0;
      }

      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int m = scn.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                  A[i] = scn.nextInt();
            }
            int[] B = new int[m];
            for (int j = 0; j < m; j++) {
                  B[j] = scn.nextInt();
            }
            System.out.println(findMedianSortedArrays(A, B));
      }
}
