import java.io.*;
import java.util.*;

public class MyGraph {
  private ArrayList<ArrayList<MyEdge>> graph;

  public void ReadFromFile (String filename) {
    try {
      File file = new File(filename);
      Scanner scanner = new Scanner(file);
      int v = scanner.nextInt();
      if (v > 50)
        throw new InputMismatchException("頂点数が多すぎます");
      int e = scanner.nextInt();
      if (e > 100)
        throw new InputMismatchException("枝数が多すぎます");
      graph = new ArrayList<ArrayList<MyEdge>>();
      for (int i = 0; i < v; ++i)
        graph.add(new ArrayList<MyEdge>());
      for (int i = 0; i < e; ++i) {
        int f,t,d;
        f = scanner.nextInt();
        t = scanner.nextInt();
        d = scanner.nextInt();
        if (d > 9999 || d < 1)
          throw new InputMismatchException("枝の重みが不正です");
        graph.get(f).add(new MyEdge(t,d));
      }
    } catch (FileNotFoundException e) {
    }
  }

  public ArrayList<MyEdge> getEdges (int id) {
    ArrayList<MyEdge> result = new ArrayList<>();
    for (int i = 0; i < this.graph.get(id).size(); ++i) {
      // System.out.println(i);
      result.add(this.graph.get(id).get(i));
    }
    return result;
  }
}
