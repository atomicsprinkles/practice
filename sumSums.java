import java.io.*;
import java.util.*;

public class Main {
  public static long gauss(long item) {
    return (item * (item + 1)) / 2;
  }

  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("sum.dat"));
    int iterThru = scan.nextInt();
    
    scan.nextLine();
    for (int z = 0; z < iterThru; z++) {
      long sum = 0;
      long[] intArrays = Arrays.stream(scan.nextLine().split("\\s+")).mapToLong(Long::parseLong).toArray();
      
      for (int i = 0; i < intArrays.length - 1; i += 2) {
        long first = intArrays[i];
        long second = intArrays[i + 1];
        sum += (second);
        while (second --> first) {
          sum += second;
        }
      }
      
      System.out.println(sum);
    }
  }
}
