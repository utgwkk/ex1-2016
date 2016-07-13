import java.util.ArrayList;

public class HeapRecursive {
  private ArrayList<Integer> heap;

  public HeapRecursive () {
    heap = new ArrayList<>();
  }

  public void push (int value) {
    heap.add(value);
    heapifyUp(heap.size() - 1);
  }

  public int top () {
    return heap.get(0);
  }

  public void pop () {
    heap.set(0,heap.get(heap.size() - 1));
    heap.remove(heap.size() - 1);
    heapifyDown(0);
  }

  private void heapifyUp (int i) {
    if (heap.get(i) < heap.get(parent(i))) {
      int swap = heap.get(i);
      heap.set(i, heap.get(parent(i)));
      heap.set(parent(i), swap);
      heapifyUp(parent(i));
    }
  }

  private void heapifyDown (int i) {
    if(leftChild(i) >= heap.size())
      return;
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
    } else {
      if (left < right && par > left) {
        int swap = left;
        heap.set(leftChild(i), par);
        heap.set(i, swap);
        heapifyDown(leftChild(i));
      } else if (right < left && par > right) {
        int swap = right;
        heap.set(rightChild(i), par);
        heap.set(i, swap);
        heapifyDown(rightChild(i));
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
