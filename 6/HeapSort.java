public class HeapSort {
  private int[] heap;
  public int[] sort (int[] input) {
    heap = new int[input.length];
    // Initialize heap with -1
    for (int i = 0; i < heap.length; ++i ) {
      heap[i] = -1;
    }
    return input;
  }

  private int parent (int index) {
    return (index - 1) / 2;
  }

  private void heapInsert (int value) {
  }
}
