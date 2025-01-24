import java.io.*;
import java.util.*;

public class Main {
  public static Set<String> sets(String s) {
    Set<String> seen = new HashSet<>();
    Set<String> repeats = new TreeSet<>();
    
    for (int i = 0; i < s.length() - 9; i++) {
      String sub = s.substring(i, i+10);
      if (seen.contains(sub)) {
        repeats.add(sub);
      } else {
        seen.add(sub);
      }
    }
    
    return repeats;
  }
  
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("dna.dat"));
    
    int iterThru = scan.nextInt();
    scan.nextLine();
    
    for (int z = 0; z < iterThru; z++) {
      Set<String> repeats = sets(scan.nextLine());
      
      System.out.println(repeats);
    }
  }
}
