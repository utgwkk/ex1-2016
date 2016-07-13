import java.util.*;
import java.io.*;

public class SortTest {
  public static void main (String[] args) {
    int[] input = read();
    InsertionSort is = new InsertionSort();
    if (input == null) {
      System.out.println("配列の読み込みに失敗しました");
      return;
    }
    int[] sorted = is.sort(input);
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
      int[] l = new int[50];
      int i = 0;
      while (scan.hasNext()) {
        int inint = scan.nextInt();
        if (inint <= 0 || inint >= 10000)
          throw new InputMismatchException();
        if (i < 50) {
          l[i] = inint;
          ++i;
        }
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
