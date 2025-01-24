import java.util.*;
import java.io.*;

public class STRAAAAT {
  public static boolean permutations(String word, String checkWord, int index) {
    if (word.equals(checkWord))
      return true;
    else if (index == word.length())
      return false;
    else
     return permutations(word.substring(word.length() - 1, word.length()) + word.substring(0, word.length() - 1), checkWord, index + 1); 
  }
  
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("pr83.dat"));
    int iterThru = scan.nextInt();
    
    scan.nextLine();
    
    for (int z = 0; z < iterThru; z++) {
      String[] line = scan.nextLine().split(" ");

      String isperm = permutations(line[0], line[1], 0) ? "YES" : "NO";
      System.out.println(isperm);
    }
  }
}
