import java.lang.*;
import java.util.*;
import java.io.*;

public class MyScanner {
  private Scanner sc;

  public MyScanner () {
    sc = new Scanner(System.in);
  }

  public int getInput() {
    String str = sc.next();
    int inint = Integer.parseInt(str);
    if (inint > 0 && inint < 10000)
      return inint;
    else throw new NumberFormatException();
  }
}
