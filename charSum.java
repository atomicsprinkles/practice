import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("charSum.dat"));
    
    int iterThru = scan.nextInt();
    
    scan.nextLine();
    for (int z = 0; z < iterThru; z++) {
      int sum = 0;
      
      char[] arr = scan.nextLine().toCharArray();
      
      for (char b : arr) {
        if (b < 65 || b > 90 && b < 97 || b > 122) {
          continue;
        }
        if (b >= 97) {
          b -= 32;
        }
        
        sum += b % 64;
      }
      
      System.out.println(sum);
    }
  }
}
