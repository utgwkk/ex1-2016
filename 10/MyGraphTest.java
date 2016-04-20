import java.io.*;
import java.util.*;


public class MyGraphTest {
  public static void main (String[] args) {
    MyGraph graph = new MyGraph();
    Scanner stdin = new Scanner(System.in);
    String filename = stdin.next();
    graph.ReadFromFile(filename);
    int input = stdin.nextInt();
    ArrayList<MyEdge> result = graph.getEdges(input);
    for (int i = 0; i < result.size(); ++i) {
      MyEdge edge = result.get(i);
      System.out.println(edge.to + " " + edge.dist);
    }
  }
}
