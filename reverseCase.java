import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("reverse.dat"));
    
    int iterThru = scan.nextInt();
    
    scan.nextLine();
    for (int z = 0; z < iterThru; z++) {
      char[] line = scan.nextLine().toCharArray();
      
      for (int i = 0; i < line.length; i++) {
        int direction = line[i] >= 97?-1:1;
        if (line[i] >= 65 && line[i] <= 90 || line[i] >= 97 && line[i] <= 122) {
          line[i] = (char) ((int) line[i] + 32 * direction);
        }
      }
      String fin = "";
      for (char c : line) {
        fin += c;
      }
      System.out.println(fin);
    }
  }
}
