import java.io.*;
import java.util.*;

public class d {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("file.dat"));
    
    int iterthru = scan.nextInt();
    scan.nextLine();
    for (int i = 0; i < iterthru; i++) {
      String[] array = scan.nextLine().split(" ");
      int[] array1 = new int[array.length];
      
      for (int j = 0; j < array.length; j++) {
        array1[j] = Integer.parseInt(array[j]);
      }
      
      int sum = 0;
      for (int j = 0; j < array.length; j++) {
        sum += array1[j];
      }
      
      System.out.println("SUM = " + sum);
    }
  }
}
