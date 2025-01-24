import java.util.*;
import java.io.*;

public class Main {
  public static int recurse(int[] arr, int n, int target, int Ct, int Sum) {
    if (n == 0) {
        return Ct == 2 ? Math.abs(target - Sum) : Integer.MAX_VALUE;
    }
    
    int include = recurse(arr, n - 1, target, Ct + 1, Sum + arr[n - 1]);
    
    int exclude = recurse(arr, n - 1, target, Ct, Sum);
    
    return Math.min(include, exclude);
  }
  

  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("pears.dat"));
    int iterThru = scan.nextInt();
    
    scan.nextLine();
    
    for (int z = 0; z < iterThru; z++) {
      int target = scan.nextInt();
      scan.nextLine();
      int[] numbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
      
      int numToReach = target - recurse(numbers, numbers.length, target, 0, 0);
      
      String pairs = "";
      boolean passed = false;
      
      for (int i = 0; i < numbers.length; i++) {
        for (int j = i + 1; j < numbers.length; j++) {
          if (numbers[i] + numbers[j] == numToReach) {
            pairs += (i + " " + j);
            passed = true;
            break;
          }
        }
        if (passed) break;
      }
      System.out.println(pairs);
    }
  }
}
