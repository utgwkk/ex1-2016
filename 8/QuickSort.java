import java.util.*;

public class QuickSort {
  public int[] sort (int[] input) {
    qsort(input, 0, input.length-1);
    return input;
  }

  private void qsort(int[] xs, int left, int right) {
    if (left >= right)
      return;
    int i = left, j = right;
    final int pivot = getPivot(xs, left, right);
    while (true) {
      while (xs[i] < pivot) i++;
      while (xs[j] > pivot) j--;
      if (i >= j) break;
      int swap = xs[i];
      xs[i] = xs[j];
      xs[j] = swap;
      i++;
      j--;
    }
    qsort(xs, left, i - 1);
    qsort(xs, j + 1, right);
  }

  private int getPivot(int[] xs, int left, int right) {
    return xs[left];
  }
}
