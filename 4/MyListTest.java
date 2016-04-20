import java.util.*;
import java.io.*;

public class MyListTest {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> l = new ArrayList<Integer>();
    MyList mylist = new MyList();
    for (int i = 0; i < 10; i++) {
      int inint = scan.nextInt();
      if (inint > 0 && inint < 10000)
        l.add(inint);
    }
    mylist.output(l);
    for (int i = 0; i < 10; ++i) {
      int inint = scan.nextInt();
      mylist.insert(inint, l);
      mylist.output(l);
    }
    for (int i = 0; i < 10; ++i) {
      int inint = scan.nextInt();
      mylist.delete(inint, l);
      mylist.output(l);
    }
  }
}
