public class MyEdge {
  public int to, dist;

  public MyEdge (int t, int d) {
    this.to = t;
    this.dist = d;
  }

  public boolean greaterThan(MyEdge rhs) {
    return this.dist > rhs.dist;
  }

  public boolean lesserThan(MyEdge rhs) {
    return !this.greaterThan(rhs);
  }
}
