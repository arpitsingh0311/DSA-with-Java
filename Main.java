
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      String s = sc.next();

      int[] count = new int[2];
      for (char ch : s.toCharArray()) {
        count[ch - '0']++;
      }

      int totalPairs = n / 2;

      if (k > totalPairs) {
        System.out.println("NO");
        continue;
      }

      System.out.println("YES");
    }
    sc.close();
  }
}
