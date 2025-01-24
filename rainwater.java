import java.util.*;
import java.io.*;

public class Main {
  public static int height(int[] arr) {
    int res = 0;
    
    for (int z = 0; z < arr.length; z++) {
      
      int left = arr[z];
      
      for (int j = 0; j < z; j++) {
        left = Math.max(left, arr[j]);
      }
      
      int right = arr[z];
      for (int j = z + 1; j < arr.length; j++)
          right = Math.max(right, arr[j]);
      
      res += Math.min(left, right) - arr[z];
    }
    return res;
  }
  
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("rainwater.dat"));
    int iterThru = scan.nextInt();
    
    scan.nextLine();
    for (int z = 0; z < iterThru; z++) {
      String data = scan.nextLine();
      
      int length = data.split("\\s+").length;
      
      boolean canFill = (data.replaceAll("[\\s0]+", "").length() > 1);
      int count = 0;
      
      int[] numbers = Arrays.stream(data.split("[\\s]+")).mapToInt(Integer::parseInt).toArray();
      
      System.out.println(height(numbers));
    }
  }
}
