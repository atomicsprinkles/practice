import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("even.dat"));
    
    int iterThru = scan.nextInt();
    scan.nextLine();
    for (int z = 0; z < iterThru; z++) {
      String[] words = scan.nextLine().split("[\\s+]");
      ArrayList<String> evens = new ArrayList<>();
      
      for (int i = 0; i < words.length; i++) {
        if(words[i].length() % 2 == 0) {
          evens.add(words[i]);
        }
      }
      
      Collections.sort(evens);
      
      for (int i = 0, j = 0; i < words.length; i++) {
        if (words[i].length() % 2 == 0) {
          if (!evens.get(j).equals(words[i])) {
            words[i] = evens.get(j);
          }
          
          j++;
        }
      }
      
      for (String fruh : words) {
        System.out.print(fruh + " ");
      }
      
      System.out.println();
    }
  }
}
