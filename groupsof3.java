import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("pr30.dat"));
    int iterThru = scan.nextInt();
    
    scan.nextLine();
    
    for (int z = 0; z < iterThru; z++) {
      String word = scan.nextLine();
      String rn = "";
      String word2 = "";
      
      for (int i = 0; i < word.length(); i++) {
        rn += word.charAt(i);
        
        if (rn.length() > 2) {
          word2 += rn + " ";
          rn = "";
        }
      }
    
      System.out.println(word2 + rn);
    }
  }
}
