import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("pr26.dat"));
    int bruh = scan.nextInt();
    
    scan.nextLine();
    for (int i = 0; i < bruh; i++) {
      String breg = scan.nextLine();
      int cout = 1;

      for (int j = 0; j < breg.length(); j++) {
        if ("aeiouAEIOU".indexOf(breg.substring(j, j+1)) != -1) {
          String prefix = breg.substring(0, j);
          String suffix = breg.substring(j + 1, breg.length());
          
          prefix += Integer.toString(cout);
          breg = prefix + suffix;
          // System.out.println(breg);
          cout++;
        }
      }
      System.out.println(breg);
    }
  }
}
