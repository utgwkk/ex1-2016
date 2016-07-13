public class MyVertex {
  public int v, dist;
  public MyVertex (int _v, int _dist) {
    v = _v;
    dist = _dist;
  }

  public int getDist () {
    return dist;
  }

  public int getNumber() {
    return v;
  }
}
