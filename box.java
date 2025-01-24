import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("box.dat"));
    
    int iterThru = scan.nextInt();
    
    scan.nextLine();
    
    for (int z = 0; z < iterThru; z++) {
      int height = scan.nextInt();
      int length = scan.nextInt();
      
      String flip = "|" + " ".repeat(length - 2) + "|\n";
      String blip = "-".repeat(length);
      
      System.out.println(blip);
      for (int i = 0; i < height - 2; i++) {
        System.out.print(flip);
      }
      System.out.println(blip);
    }
  }
}
