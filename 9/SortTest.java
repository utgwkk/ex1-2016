import java.util.*;
import java.io.*;
import java.nio.file.*;

public class SortTest {
  public static void main (String[] args) {
    ArrayList<String> input = read();
    if (input == null) {
      System.out.println("不正です");
      return;
    }
    BucketSort bs = new BucketSort();
    try {
      input = bs.sort(input);
      for (int i = 0; i < input.size(); ++i) {
        System.out.println(input.get(i));
      }
    } catch (InputMismatchException e) {
      System.out.println("アルファベットが多すぎます");
      return;
    }
  }

  public static ArrayList<String> read () {
    System.out.print("inputファイル名を入力してください: ");
    System.out.flush();
    Scanner stdin = new Scanner(System.in);
    String infilename = stdin.next();
    ArrayList<String> l = new ArrayList<>();
    try {
      File inputFile = new File(infilename);
      String content = new String(Files.readAllBytes(Paths.get(infilename)));
      content = content.toLowerCase();
      content = content.replaceAll(",", " ");
      content = content.replaceAll("\\.", " ");
      Scanner scan = new Scanner(content);
      while (scan.hasNext()) {
        String str = scan.next();
        if (str.matches("[a-z]+"))
          l.add(str);
      }
      return l;
    } catch (FileNotFoundException e) {
      System.out.println("ファイル " + infilename + " は存在しません");
      return null;
    } catch (IOException e) {
      System.out.println("ファイル " + infilename + " の読み込みに失敗しました ");
      return null;
    }
  }
}
