import java.util.*;
import java.io.*;

public class SortTest {
  public static void main (String[] args) {
    int[] input = read();
    HeapSort hs = new HeapSort();
    if (input == null) {
      System.out.println("配列の読み込みに失敗しました");
      return;
    }
    int[] sorted = hs.sort(input);
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
        if (inint <= 0 || inint >= 10000)
          throw new InputMismatchException();
        if (i < 50) {
          al.add(inint);
        } else {
          System.err.println("不正なデータが入力されました");
          return null;
        }
      }
      int l[] = new int[al.size()];
      for (int i = 0; i < al.size(); ++i) {
        l[i] = al.get(i);
      }
      return l;
    } catch (FileNotFoundException e) {
      System.out.println("ファイル " + infilename + " は存在しません");
      return null;
    } catch (InputMismatchException e) {
      System.out.println("不正なデータが入力されました");
      return null;
    }
  }
}
