import java.util.*;

public class MergeSort {
  public int[] sort (int[] input) {
    ArrayList<Integer> l = new ArrayList<>();
    for (int i = 0; i < input.length; ++i) {
      l.add(input[i]);
    }
    l = mergesort(l);
    for (int i = 0; i < input.length; ++i) {
      input[i] = l.get(i);
    }
    return input;
  }

  public ArrayList<Integer> mergesort(ArrayList<Integer> l) {
    int size = l.size();
    if (size <= 1)
      return l;
    int middle = l.size() / 2;
    ArrayList<Integer> lefter = new ArrayList<>();
    ArrayList<Integer> righter = new ArrayList<>();
    for (int i = 0; i < middle; ++i) {
      lefter.add(l.get(i));
    }
    for (int i = middle; i < size; ++i) {
      righter.add(l.get(i));
    }
    lefter = mergesort(lefter);
    righter = mergesort(righter);
    ArrayList<Integer> result = new ArrayList<>();
    for (int i = 0, j = 0; i < lefter.size() || j < righter.size();) {
      if (i < lefter.size() && j < righter.size()) {
        if (lefter.get(i) < righter.get(j)){
          result.add(lefter.get(i));
          ++i;
        } else {
          result.add(righter.get(j));
          ++j;
        }
      } else {
        if (i < lefter.size()) {
          result.add(lefter.get(i));
          ++i;
        } else if (j < righter.size()) {
          result.add(righter.get(j));
          ++j;
        }
      }
    }
    return result;
  }
}
