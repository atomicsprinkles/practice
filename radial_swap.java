import java.io.*;
import java.util.*;

public class Main {
    public static String[] swaps(String[] arr) {
      int middleIndex = arr.length / 2;
      int left = (arr.length % 2 == 0) ? middleIndex - 2 : middleIndex - 1;
      int right = middleIndex + 1;
      
      while (left >= 0 && right < arr.length) {
          String temp = arr[left];
          arr[left] = arr[right];
          arr[right] = temp;

          left -= 2;
          right += 2;
      }

      return arr;
  }
  
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("swap.dat"));
    
    int iterThru = scan.nextInt();
    
    scan.nextLine();
    
    for (int z = 0; z < iterThru; z++) {
      String[] arr = scan.nextLine().split("\\s+");
      String[] arr2 = swaps(arr);
      
      for (String item : arr2) {
        System.out.print(item + " ");
      }
      System.out.println();
    }
  }
}
