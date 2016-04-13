import java.util.*;
import java.io.*;

public class SortTest {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> l = new ArrayList<Integer>();
    while(scan.hasNext()){
      int inint = Integer.parseInt(scan.next());
      if(inint > 0 && inint < 1000)
        l.add(inint);
    }
    int[] a = l.stream().mapToInt(i->i).toArray();
    BubbleSort bs = new BubbleSort();
    a = bs.sort(a);
    for(int i=0;i<a.length;i++){
      if(i%10==0&&i>0)System.out.println();
      System.out.print(String.format("%1$4d", a[i]));
      if(i%10==9&&i!=a.length-1)System.out.print(" ");
    }
  }
}
