import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("pr86.dat"));
    int iterThru = scan.nextInt();
    
    scan.nextLine();
    for (int i = 0; i < iterThru; i++) {
      char[] parentheses = scan.nextLine().toCharArray();
      Stack<Character> stack = new Stack<>();
      int ct = 0;
      
      for (char c : parentheses) {
        if (c == ')') {
          stack.pop();
          ct++;
        } else
          stack.push(c);
      }
      
      System.out.println(ct);
    }
  }
}
