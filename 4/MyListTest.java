import java.lang.*;
import java.util.*;
import java.io.*;

public class MyListTest {
  public static void main (String[] args) {
    MyScanner scan = new MyScanner();
    ArrayList<Integer> l = new ArrayList<Integer>();
    MyList mylist = new MyList();
    try {
      for (int i = 0; i < 10; i++) {
        int inint = scan.getInput();
        l.add(inint);
      }
      mylist.output(l);
      for (int i = 0; i < 10; ++i) {
        int inint = scan.getInput();
        mylist.insert(inint, l);
        mylist.output(l);
      }
      for (int i = 0; i < 10; ++i) {
        int inint = scan.getInput();
        mylist.delete(inint, l);
        mylist.output(l);
      }
    } catch (NumberFormatException e) {
      System.out.println("不正なデータが入力されました");
    }
  }
}
