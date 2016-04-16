import java.util.*;
import java.io.*;

public class MyLecture2 {
  public String[] readFile(String infilename){
    ArrayList<String> lines = new ArrayList<>();

    try{
      File inputFile = new File(infilename);
      Scanner sc = new Scanner(inputFile);
      while(sc.hasNext()){
        String line = sc.next();
        lines.add(line);
      }
    }catch(FileNotFoundException ex){
      System.out.println("File " + infilename + " was not found. ");
      return null;
    }

    return lines.toArray(new String[0]);
  }

  public void convert(String infilename, String outfilename){
    try{
      String[] lines = readFile(infilename);
      String[] jikanwari = {"Tu1", "Mo2", "Mo1", "Tu3", "Mo2", "Th1"};
      File outputFile = new File(outfilename);
      FileWriter writer = new FileWriter(outputFile);
      for(int i=0;i<lines.length;i++){
        String line = lines[i];
        writer.write(jikanwari[i] + "\t" + line + "\n");
      }
      writer.close();
    }catch(IOException ex){
      System.out.println("Failed to write file");
    }
  }
}
