public class BubbleSort {
  public int[] sort(int[] input){
    for(int i=0;i<input.length;i++){
      for(int j=i+1;j<input.length;j++){
        if(input[i]>input[j]){
          int a=input[i];
          input[i]=input[j];
          input[j]=a;
        }
      }
    }
    return input;
  }
}
