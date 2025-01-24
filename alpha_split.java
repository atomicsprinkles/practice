import java.io.*;
import java.util.*;
//A is 65 M is 77, 97 is m therefore 109 is m
public class Main {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("pr77.dat"));
    
    int iterThru = scan.nextInt();
    
    scan.nextLine();
    for (int z = 0; z < iterThru; z++) {
      String up = "";
      String bottom = "";
      
      char[] iterMe = scan.nextLine().toCharArray();
      
      for (char cha : iterMe) {
        if (cha >= 65 && cha <= 77) {
          up += cha;
          bottom += " ";
        } else if (cha >= 78 && cha <= 90) {
          bottom += cha;
          up += " ";
        } else {
          up += cha;
          bottom += cha;
        }
      }
      
      System.out.println(up + "\n" + bottom);
      System.out.println();
    }
    
    
  }
}
