import java.io.*;
import java.util.*;

public class MyGraph {
  private ArrayList<ArrayList<MyEdge>> graph;
  private int vsize;

  public void ReadFromFile (String filename) {
    try {
      File file = new File(filename);
      Scanner scanner = new Scanner(file);
      int v = scanner.nextInt();
      vsize = v;
      int e = scanner.nextInt();
      graph = new ArrayList<ArrayList<MyEdge>>();
      for (int i = 0; i < v; ++i)
        graph.add(new ArrayList<MyEdge>());
      for (int i = 0; i < e; ++i) {
        int f,t,d;
        f = scanner.nextInt();
        t = scanner.nextInt();
        d = scanner.nextInt();
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

  public ArrayList<MyEdge> get (int id) {
    return this.graph.get(id);
  }

  public int getVsize () {
    return this.vsize;
  }
}
