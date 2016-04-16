import java.util.*;

public class MyList {
  public void insert(int x, ArrayList<Integer> l) {
    int index = l.indexOf(i);
    if (index == -1)
      l.add(i);
    else
      l.add(index, i);
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
