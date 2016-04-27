import java.io.*;

public class HeapSort {
  private int[] heap;
  private final int inf = 10000000;

  public int[] sort (int[] input) {
    Heap q = new Heap();
    for (int i = 0; i < input.length; ++i ) {
      q.push(input[i]);
    }
    for (int i = 0; i < input.length; ++i ) {
      input[i] = q.top();
      q.pop();
    }
    return input;
  }
}
