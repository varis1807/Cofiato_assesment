import java.util.*;
public class Implement {
      public static int strStr(String haystack, String needle) {
            for (int i = 0; ; i++) {
        for (int j = 0; ; j++) {
          if (j == needle.length()) return i;
          if (i + j == haystack.length()) return -1;
          if (needle.charAt(j) != haystack.charAt(i + j)) break;
        }
      }
        }
        public static void main(String[] args) {
            Scanner scn=new Scanner(System.in);
            String haystack = scn.nextLine();
            String needle = scn.nextLine();
            System.out.println(strStr(haystack, needle));
        }
}
