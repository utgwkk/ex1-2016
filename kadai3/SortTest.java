import java.util.*;
import java.io.*;

public class SortTest {
  public static void main (String[] args) {
    DataInputStream dis = new DataInputStream(System.in);
    System.out.print("inputファイル名を入力してください: ");
    System.out.flush();
    Scanner stdin = new Scanner(System.in);
    String infilename = stdin.next();
    try {
      File inputFile = new File(infilename);
      Scanner scan = new Scanner(inputFile);
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
    } catch (FileNotFoundException e) {
      System.out.println("ファイル " + infilename + " は存在しません");
    }
  }
}
