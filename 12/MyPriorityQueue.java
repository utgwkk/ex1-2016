import java.util.ArrayList;

public class MyPriorityQueue {
  private ArrayList<MyVertex> heap;

  public MyPriorityQueue () {
    heap = new ArrayList<>();
  }

  public void push (MyVertex value) {
    heap.add(value);
    for (int i = heap.size() - 1; i > 0; i = parent(i)) {
      if (heap.get(i).lesserThan(heap.get(parent(i)))) {
        MyVertex swap = heap.get(i);
        heap.set(i, heap.get(parent(i)));
        heap.set(parent(i), swap);
      }
    }
  }

  public MyVertex top () {
    return heap.get(0);
  }

  public boolean empty() {
    return heap.isEmpty();
  }

  public void pop () {
    heap.set(0,heap.get(heap.size() - 1));
    heap.remove(heap.size() - 1);
    heapify();
  }

  private void heapify () {
    int i = 0;
    while(leftChild(i) < heap.size()){
      MyVertex par = heap.get(i);
      MyVertex left = heap.get(leftChild(i));
      MyVertex right;
      if (rightChild(i) < heap.size()) {
        right = heap.get(rightChild(i));
      } else {
        right = null;
      }
      if (right == null) {
        if (par.lesserThan(left)) {
          MyVertex swap = left;
          heap.set(leftChild(i), par);
          heap.set(i, swap);
        }
        break;
      } else {
        if (left.lesserThan(right) && par.lesserThan(left)) {
          MyVertex swap = left;
          heap.set(leftChild(i), par);
          heap.set(i, swap);
          i = leftChild(i);
        } else if (right.lesserThan(left) && par.lesserThan(right)) {
          MyVertex swap = right;
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
}
