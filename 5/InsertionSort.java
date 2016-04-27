import java.util.*;
import java.io.*;

public class InsertionSort {
  public int[] sort (int[] input) {
    ArrayList<Integer> as = new ArrayList<>();
    for (int i = 0; i < input.length; ++i) {
      as.add(input[i]);
    }
    for (int i = 1; i < input.length; ++i) {
      for (int j = 0; j < i-1; ++j) {
        if (as.get(j) > as.get(i)){
          as.add(j, as.get(i));
          as.remove(i+1);
        }
      }
    }
    for (int i = 0; i < input.length; ++i) {
      input[i] = as.get(i);
    }
    return input;
  }
}
