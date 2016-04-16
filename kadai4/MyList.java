import java.util.*;

public class MyList {
  public void insert(int x, ArrayList<Integer> l) {
    for(int i = 0; i < l.size(); ++i) {
      if (l.get(i) >= x){
        l.add(i,x);
        return;
      }
    }
    l.add(x);
  }

  public void delete(int x, ArrayList<Integer> l) {
    while (l.contains(x))
      l.remove((Object)x);
  }

  public void output(ArrayList<Integer> l) {
    for(int i = 0; i < l.size(); ++i) {
      System.out.print(l.get(i));
      if(i != l.size() - 1)
        System.out.print(" ");
    }
    System.out.println();
  }
}
