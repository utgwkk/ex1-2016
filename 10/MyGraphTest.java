import java.io.*;
import java.util.*;


public class MyGraphTest {
  public static void main (String[] args) {
    MyGraph graph = new MyGraph();
    Scanner stdin = new Scanner(System.in);
    String filename = stdin.next();
    graph.ReadFromFile(filename);
  }
}
