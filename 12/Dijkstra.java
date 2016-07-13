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
    PriorityQueue<MyVertex> q = new PriorityQueue<>(Comparator.comparing(MyVertex::getDist));
    if (start >= 0 && start < graph.getVsize()) {
      dist.set(start, 0);
      q.add(new MyVertex(start, 0));
    }
    while (q.size() > 0) {
      MyVertex v = q.poll();
      if (dist.get(v.getNumber()) < v.getDist())
        continue;
      for (int i = 0; i < graph.getEdges(v.getNumber()).size(); ++i) {
        MyEdge edge = graph.getEdges(v.getNumber()).get(i);
        int u = edge.to;
        int cost = edge.dist;
        if (dist.get(u) > dist.get(v.v) + cost) {
          dist.set(u, dist.get(v.v) + cost);
          prev.set(u, v.v);
          q.add(new MyVertex(u, dist.get(u)));
        }
      }
    }
    ArrayList<Integer> route = new ArrayList<>();
    int now = goal;
    while(now != -1 && now < graph.getVsize()) {
      route.add(0, now);
      now = prev.get(now);
    }
    if (route.isEmpty() || route.get(0) != start) {
      System.out.println("最短経路が存在しません");
    } else {
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
}
