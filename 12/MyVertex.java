public class MyVertex {
  public int v, dist;
  public MyVertex (int _v, int _dist) {
    v = _v;
    _dist = dist;
  }

  public boolean greaterThan(MyVertex rhs) {
    return this.dist > rhs.dist;
  }

  public boolean lesserThan(MyVertex rhs) {
    return !this.greaterThan(rhs);
  }
}
