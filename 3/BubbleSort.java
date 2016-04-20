public class BubbleSort {
  public int[] sort (int[] input) {
    for (int i = input.length - 1; i >= 0; --i) {
      for (int j = 0; j < i; ++j) {
        if (input[j] > input[j+1]) {
          int a = input[j+1];
          input[j+1] = input[j];
          input[j] = a;
        }
      }
    }
    return input;
  }
}
