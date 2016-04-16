import java.util.*;
import java.io.*;

public class SortTest {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] l = new int[50];
    int i = 0;
    while (scan.hasNext()) {
      int inint = Integer.parseInt(scan.next());
      if (inint > 0 && inint < 10000) {
        l[i] = inint;
        ++i;
      }
    }
    BubbleSort bs = new BubbleSort();
    l = bs.sort(l);
    for (int j = 0; j < l.length; ++j) {
      if (j % 10 == 0 && j > 0)
        System.out.println();
      System.out.print(String.format("%1$5d", l[j]));
    }
  }
}
