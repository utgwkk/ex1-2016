import java.io.*;

public class HeapSort {
  public int[] sort (int[] input) {
    // Heap q = new Heap();
    HeapRecursive q = new HeapRecursive();
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
