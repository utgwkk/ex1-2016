import java.util.*;
import java.io.*;

public class SortTest {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = Integer.parseInt(scan.next());
    ArrayList<Integer> l = new ArrayList<Integer>();
    for(int i=0;i<n;i++){
      l.add(Integer.parseInt(scan.next()));
    }
    int[] a = l.stream().mapToInt(i->i).toArray();
    BubbleSort bs = new BubbleSort();
    a = bs.sort(a);
    for(int i=0;i<n;i++){
      if(i%10==0&&i>0)System.out.println();
      System.out.print(String.format("%1$4d ", a[i]));
    }
  }
}
