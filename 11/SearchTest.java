import java.io.*;
import java.util.*;

public class SearchTest {
  public static void main (String[] args) {
    MyGraph graph = new MyGraph();
    Scanner stdin = new Scanner(System.in);
    String filename = stdin.next();
    graph.ReadFromFile(filename);
    int start = stdin.nextInt();
    Search.breadthFirstSearch(graph, start);
  }
}
