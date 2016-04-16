import java.util.*;

public class MyList {
  public void insert(int x, ArrayList<Integer> l) {
    int index = l.indexOf(x);
    if (index == -1)
      l.add(x);
    else
      l.add(index, x);
  }

  public void delete(int x, ArrayList<Integer> l) {
    while (l.contains(x))
      l.remove(x);
  }

  public void output(ArrayList<Integer> l) {
    for(int i = 0; i < l.size(); ++i) {
      System.out.print(l.get(i));
      if(i != l.size() - 1)
        System.out.print(" ");
    }
  }
}
