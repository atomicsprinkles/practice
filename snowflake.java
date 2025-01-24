import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("pr37.dat"));
    while (scan.hasNext()) {
      int num = scan.nextInt();
      int len = (num - 1) * 2 + 3;
      
      for (int i = num, j = 0; i > 0 && j <= num - 1; i--, j++) {
        int insidespaces = num - 1 - j;
        String qqq = " ".repeat(j) + (num + " ".repeat(insidespaces)).repeat(3);
        System.out.println(qqq);
      }
      
      System.out.println(Integer.toString(num).repeat(len));
      
      for (int i = num, j = 0; i > 0 && j <= num - 1; i--, j++) {
        int insidespaces = num - 1 - j;
        String qqq = " ".repeat(insidespaces) + (num + " ".repeat(j)).repeat(3);
        System.out.println(qqq);
      }
      
      System.out.println();
    }
  }
}
