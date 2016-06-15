import java.util.*;
import java.io.*;

class BucketSort {
  public ArrayList<String> sort (ArrayList<String> input) {
    //a-z
    ArrayList<ArrayList<String>> bucket = new ArrayList<>();
    for (int i = 0; i < 26; ++i) {
      bucket.add(new ArrayList<>());
    }
    for (int i = 0; i < input.size(); ++i) {
      char firstChar = input.get(i).toCharArray()[0];
      bucket.get((int)(firstChar)-(int)'a').add(input.get(i));
    }
    for (int i = 0; i < 26; ++i) {
      if (bucket.get(i).size() > 100) {
        throw new InputMismatchException();
      }
    }
    for (int i = 0; i < 26; ++i) {
      bucket.set(i, bubbleSort(bucket.get(i)));
    }
    ArrayList<String> result = new ArrayList<>();
    for (int i = 0; i < 26; ++i) {
      for (int j = 0; j < bucket.get(i).size(); ++j){
        result.add(bucket.get(i).get(j));
      }
    }
    return result;
  }

  private static ArrayList<String> bubbleSort (ArrayList<String> input) {
    for (int i = input.size() - 1; i >= 0; --i) {
      for (int j = 0; j < i; ++j) {
        if (greater(input.get(j), input.get(j+1))) {
          String a = input.get(j+1);
          input.set(j + 1, input.get(j));
          input.set(j, a);
        }
      }
    }
    return input;
  }
  
  private static boolean greater(String lhs, String rhs) {
    if (lhs.length() == 0 || rhs.length() == 0) {
      return lhs.length() > rhs.length();
    }
    char[] lhsCh = lhs.toCharArray();
    char[] rhsCh = rhs.toCharArray();
    if (lhsCh[0] > rhsCh[0]) {
      return true;
    } else if (lhsCh[0] < rhsCh[0]) {
      return false;
    } else {
      return greater(lhs.substring(1, lhs.length()), rhs.substring(1, rhs.length()));
    }
  }
}
