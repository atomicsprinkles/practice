import java.io.*;
import java.util.*;

public class Main {
  public static long factorial(long n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    
    return n * factorial(n-1);
  }
  
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("pr152.dat"));
    
    int iterThru = scan.nextInt();
    
    scan.nextLine();
    for (int z = 0; z < iterThru; z++) {
      long n = scan.nextLong();
      scan.nextLine();
      for (int i = 0; i < n; i++) {
        scan.nextLine();
      }
      
      System.out.println(factorial(n) / (6*factorial(n - 3)));
      
    }
    
  }
}
