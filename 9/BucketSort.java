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
        if (input.get(j).compareTo(input.get(j+1)) > 0) {
          String a = input.get(j+1);
          input.set(j + 1, input.get(j));
          input.set(j, a);
        }
      }
    }
    return input;
  }
}
