import java.util.LinkedList;

public class MyQueue<T extends Object> {
  private LinkedList<T> data;

  public MyQueue () {
    data = new LinkedList<>();
  }

  public T front () {
    if (data.size() == 0)
      return null;
    else
      return data.get(0);
  }

  public void pop () {
    if (data.size() == 0)
      return;
    data.removeFirst();
  }

  public void push (T val) {
    data.addLast(val);
  }

  public int size () {
    return data.size();
  }

  public boolean empty() {
    return data.isEmpty();
  }
}
