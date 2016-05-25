import java.util.*;
import java.io.*;

public class Search {
  public static void depthFirstSearch (MyGraph graph, int start) {
    Stack<Integer> st = new Stack<>();
    HashSet<Integer> visited = new HashSet<>();
    st.push(start);
    while (!st.empty()) {
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
    MyQueue<Integer> qu = new MyQueue<>();
    HashSet<Integer> visited = new HashSet<>();
    qu.push(start);
    while (qu.size() > 0) {
      int now = qu.front();
      qu.pop();
      if (visited.contains(now))
        continue;
      visited.add(now);
      System.out.println(now);
      for (int i = 0; i < graph.get(now).size(); ++i) {
        int next = graph.get(now).get(i).to;
        if (!visited.contains(next)) {
          qu.push(next);
        }
      }
    }
  }
}
