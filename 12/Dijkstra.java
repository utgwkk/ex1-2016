import java.io.*;
import java.util.*;

public class Dijkstra {
  public static final int INF = 1<<30;

  public static void main(String[] args) {
    MyGraph graph = new MyGraph();
    Scanner stdin = new Scanner(System.in);
    String filename = stdin.next();
    graph.ReadFromFile(filename);
    int start = stdin.nextInt();
    int goal = stdin.nextInt();
    dijkstra(graph, start, goal);
  }

  public static void dijkstra (MyGraph graph, int start, int goal) {
    ArrayList<Integer> dist = new ArrayList<>();
    ArrayList<Integer> prev = new ArrayList<>();
    for (int i = 0; i < graph.getVsize(); ++i) {
      dist.add(INF);
      prev.add(-1);
    }
    dist.set(start, 0);
    MyPriorityQueue q = new MyPriorityQueue();
    q.push(new MyVertex(start, 0));
    while (!q.empty()) {
      MyVertex v = q.top();
      q.pop();
      if (dist.get(v.v) < v.dist)
        continue;
      for (int i = 0; i < graph.get(v.v).size(); ++i) {
        MyEdge edge = graph.get(v.v).get(i);
        int u = edge.to;
        int cost = edge.dist;
        if (dist.get(u) > dist.get(v.v) + cost) {
          dist.set(u, dist.get(v.v) + cost);
          prev.set(u, v.v);
          q.push(new MyVertex(u, dist.get(u)));
        }
      }
    }
    LinkedList<Integer> route = new LinkedList<>();
    int now = goal;
    while(now != -1) {
      route.addFirst(now);
      now = prev.get(now);
    }
    for (int i = 0; i < route.size(); ++i) {
      System.out.print(route.get(i));
      if (i < route.size() - 1) {
        System.out.print(" ");
      }
    }
    System.out.println();
    System.out.println(dist.get(goal));
  }
}
