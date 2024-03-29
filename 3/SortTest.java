import java.util.*;
import java.io.*;

public class SortTest {
  public static void main (String[] args) {
    int[] input = read();
    BubbleSort bs = new BubbleSort();
    if (input == null) {
      System.out.println("配列の読み込みに失敗しました");
      return;
    }
    int[] sorted = bs.sort(input);
    for (int j = 0; j < sorted.length; ++j) {
      if (j % 10 == 0 && j > 0)
        System.out.println();
      System.out.print(String.format("%1$4d", sorted[j]));
      if (j % 10 >= 0 && j % 10 < 9)
        System.out.print(" ");
    }
  }

  public static int[] read () {
    System.out.print("inputファイル名を入力してください: ");
    System.out.flush();
    Scanner stdin = new Scanner(System.in);
    String infilename = stdin.next();
    try {
      File inputFile = new File(infilename);
      Scanner scan = new Scanner(inputFile);
      ArrayList<Integer> al = new ArrayList<>();
      for (int i = 0; scan.hasNext(); ++i) {
        int inint = scan.nextInt();
        if (inint > 0 && inint < 10000 && i < 50) {
          al.add(inint);
        } else {
          System.err.println("要件を満たしていないデータが入力されました");
          return null;
        }
      }
      int[] l = new int[al.size()];
      for(int i = 0; i < al.size(); ++i)
        l[i] = al.get(i);
      return l;
    } catch (FileNotFoundException e) {
      System.err.println("ファイル " + infilename + " は存在しません");
      return null;
    }
  }
}
