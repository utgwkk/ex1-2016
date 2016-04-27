import java.util.ArrayList;

public class Heap {
  private ArrayList<Integer> heap;

  public Heap () {
    heap = new ArrayList<>();
  }

  public void push (int value) {
    int i = heap.size() - 1;
    heap.add(value);
    i++;
    for (; i > 0; i = parent(i)) {
      if (heap.get(i) < heap.get(parent(i))) {
        int swap = heap.get(i);
        heap.set(i, heap.get(parent(i)));
        heap.set(parent(i), swap);
      }
    }
  }

  public int top () {
    return heap.get(0);
  }

  public void pop () {
    heap.remove(0);
    heapify();
  }

  private void heapify () {
  }

  private int parent (int index) {
    return (index - 1) / 2;
  }

  public void output () {
    for (int i = 0; i < heap.size(); ++i) {
      System.out.println(heap.get(i));
    }
  }
}
