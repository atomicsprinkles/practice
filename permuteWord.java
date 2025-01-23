import java.util.*;
import java.io.*;

public class ELSKIB {
  public static ArrayList<String> RECURSE(char[] Word, int index, int permCt) {
    ArrayList<String> wordPerms = new ArrayList<String>();
    int listCreated = 0;
    
    String skib = "";
    
    for (int i = 0; i < Word.length; i++) {
      String ack = "";
      for (int j = 0; j < Word.length; j++) {
        if (Word[i] == Word[index] && Word[j] == Word[i])
          continue;
        if (ack.length() < permCt) {
          ack += Word[j];
        }
        if (ack.length() == permCt) {
          wordPerms.add(ack);
        }
      }
      ack = "";
    }
    
    return wordPerms;
  }
  
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("pr150.dat"));
    
    int iterThru = scan.nextInt();
    
    scan.nextLine();
    for(int x = 0; x < iterThru; x++) {
      char[] PERMUTE = scan.next().toCharArray();
      int permutationCt = scan.nextInt();
      
      System.out.println(RECURSE(PERMUTE, 0, permutationCt));
    }
  }
}
