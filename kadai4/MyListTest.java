import java.util.*;
import java.io.*;

public class MyListTest {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> l = new ArrayList<Integer>();
    while (scan.hasNext()) {
      int inint = Integer.parseInt(scan.next());
      if (inint > 0 && inint < 10000)
        l.add(inint);
    }
    MyList mylist = new MyList();
    for (int i = 0; i < 10; ++i) {
      int inint = Integer.parseInt(scan.next());
      mylist.delete(inint, l);
    }
  }
}
