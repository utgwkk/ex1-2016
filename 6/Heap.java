import java.util.ArrayList;

public class Heap {
  private ArrayList<Integer> heap;

  public Heap () {
    heap = new ArrayList<>();
  }

  public void push (int value) {
    heap.add(value);
    int i = heap.size() - 1;
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
    heap.set(0,heap.get(heap.size() - 1));
    heap.remove(heap.size() - 1);
    int i = 0;
    while(leftChild(i) < heap.size()){
      int par = heap.get(i);
      int left = heap.get(leftChild(i));
      int right;
      if (rightChild(i) < heap.size()) {
        right = heap.get(rightChild(i));
      } else {
        right = -1;
      }
      if (right == -1) {
        if (par > left) {
          int swap = left;
          heap.set(leftChild(i), par);
          heap.set(i, swap);
        }
        break;
      } else {
        if (left < right && par > left) {
          int swap = left;
          heap.set(leftChild(i), par);
          heap.set(i, swap);
          i = leftChild(i);
        } else if (right < left && par > right) {
          int swap = right;
          heap.set(rightChild(i), par);
          heap.set(i, swap);
          i = rightChild(i);
        } else {
          break;
        }
      }
    }
  }

  private int parent (int index) {
    return (index - 1) / 2;
  }

  private int leftChild (int index) {
    return index * 2 + 1;
  }

  private int rightChild (int index) {
    return index * 2 + 2;
  }

  public void output () {
    for (int i = 0; i < heap.size(); ++i) {
      System.out.println(heap.get(i));
    }
  }
}
