import java.util.*;
import java.io.*;

public class Search {
  public static void depthFirstSearch (MyGraph graph, int start) {
    LinkedList<Integer> st = new LinkedList<>();
    HashSet<Integer> visited = new HashSet<>();
    st.push(start);
    while (st.size() > 0) {
      int now = st.pop();
      if (visited.contains(now))
        continue;
      visited.add(now);
      System.out.println(now);
      for (int i = 0; i < graph.get(now).size(); ++i) {
        int next = graph.get(now).get(i).to;
        if (!visited.contains(next)) {
          st.add(next);
        }
      }
    }
  }

  public static void breadthFirstSearch (MyGraph graph, int start) {
    LinkedList<Integer> qu = new LinkedList<>();
    HashSet<Integer> visited = new HashSet<>();
    qu.add(start);
    while (qu.size() > 0) {
      int now = qu.pop();
      if (visited.contains(now))
        continue;
      visited.add(now);
      System.out.println(now);
      for (int i = 0; i < graph.get(now).size(); ++i) {
        int next = graph.get(now).get(i).to;
        if (!visited.contains(next)) {
          qu.add(next);
        }
      }
    }
  }
}
